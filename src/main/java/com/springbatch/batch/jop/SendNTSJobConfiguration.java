package com.springbatch.batch.jop;

import com.springbatch.batch.decider.NTSDecider;
import com.springbatch.batch.listener.NTSJobListener;
import com.springbatch.batch.listener.NTSStepListener;
import com.springbatch.dto.NTS.CompanyChangeGubun;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.batch.MyBatisBatchItemWriter;
import org.mybatis.spring.batch.MyBatisPagingItemReader;
import org.mybatis.spring.batch.builder.MyBatisBatchItemWriterBuilder;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.job.flow.JobExecutionDecider;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.dao.DeadlockLoserDataAccessException;

import java.nio.charset.MalformedInputException;
import java.sql.SQLException;

@Slf4j // log 사용을 위한 lombak 어노테이션
@RequiredArgsConstructor // 생성자 DI를 위한 lombak 어노테이션
@Configuration
//https://godekdls.github.io/Spring%20Batch/configuringandrunningajob/
public class SendNTSJobConfiguration {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;
    private final @Qualifier("sqlSessionNTSFactory")SqlSessionFactory sqlSessionFactory;
//    @Value("#{jobParameters[datetime]}")
//    private String datetime;

    @Bean
    public Job sendNTSJob() {
        return jobBuilderFactory.get("sendNTSJob")
                .incrementer(new RunIdIncrementer())
//                .incrementer(new CurrentTimeIncrementer())
                .listener(new NTSJobListener())
                .start(sendNTSStep())
                .next(decider())
                .from(decider()).on("COMPLETED").to(sendSuccessStep())
                .from(decider()).on("FAILED").to(sendFailStep())
                .end()
                .build();
    }

    @Bean
    public Step sendNTSStep() {
        return stepBuilderFactory.get("sendNTSStep")
                .listener(new NTSStepListener())
                .<CompanyChangeGubun,CompanyChangeGubun> chunk(10)
                .reader(sendNTSReader())
                .writer(sendNTSWriter())
                .faultTolerant()
                .skipLimit(3)
                .skip(SQLException.class)
                .retryLimit(3)
                .retry(ConnectTimeoutException.class)
                .retry(DeadlockLoserDataAccessException.class)
                .noRetry(MalformedInputException.class)
                .build();
    }

    @Bean
    public Step sendSuccessStep() {
        return stepBuilderFactory.get("sendSuccessStep")
                .tasklet((stepContribution, chunkContext) -> {
                    log.info("Success Batch Id {}", stepContribution.getStepExecution().getJobExecutionId() );

                    return RepeatStatus.FINISHED;
                })
                .build();
    }

    @Bean
    public Step sendFailStep() {
        return stepBuilderFactory.get("sendFailStep")
                .tasklet((stepContribution, chunkContext) -> {
                    log.info("Fail Batch Id {} ", stepContribution.getStepExecution().getJobExecutionId() );
                    return RepeatStatus.FINISHED;
                })
                .build();
    }

    @Bean
    @StepScope
    public MyBatisPagingItemReader<CompanyChangeGubun> sendNTSReader() {
        MyBatisPagingItemReader<CompanyChangeGubun> myBatisPagingItemReader = new MyBatisPagingItemReader<>();
        myBatisPagingItemReader.setQueryId("CompanyMapper.batchNTSExcelListForCash");
        myBatisPagingItemReader.setSqlSessionFactory(sqlSessionFactory);
        myBatisPagingItemReader.setPageSize(10);
        return myBatisPagingItemReader;
    }

//    https://recordsoflife.tistory.com/57
    @Bean
    @StepScope
    public FlatFileItemWriter<CompanyChangeGubun> sendNTSWriter() {
        FlatFileItemWriter<CompanyChangeGubun> writer = new FlatFileItemWriter<>();
        writer.setResource(new FileSystemResource("/file/output"+System.currentTimeMillis()+".txt"));
        writer.setAppendAllowed(false);

        writer.setLineAggregator(new DelimitedLineAggregator<CompanyChangeGubun>() {
            {
                setDelimiter("|");
                setFieldExtractor(new BeanWrapperFieldExtractor<CompanyChangeGubun>() {
                    {
                        setNames(new String[] { "changeGubun", "registNum", "afStartYmd", "afEndYmd", "modCode"
                                , "bfStartYmd", "bfEndYmd"});
                    }
                });
            }
        });
        return writer;
    }

    @Bean
    public MyBatisBatchItemWriter<CompanyChangeGubun> batchResultWriter(SqlSessionFactory sqlSessionFactory) {
        return new MyBatisBatchItemWriterBuilder<CompanyChangeGubun>()
                .sqlSessionFactory(sqlSessionFactory)
                .statementId("CompanyMapper.saveEmployee")
                .build();
    }

    @Bean
    public JobExecutionDecider decider() {
        return new NTSDecider();
    }
}
