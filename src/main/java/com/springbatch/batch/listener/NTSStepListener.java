package com.springbatch.batch.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;

@Slf4j
public class NTSStepListener extends StepExecutionListenerSupport {

    @Override
    public void beforeStep(StepExecution stepExecution) {
        if(stepExecution.getStatus() == BatchStatus.STARTED) {
            log.info("chunkStep start!");
        }
    }
    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        if(stepExecution.getStatus() == BatchStatus.COMPLETED) {
            log.info("chunkStep end");
        }
        return super.afterStep(stepExecution);
    }

}