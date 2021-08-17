package com.springbatch.batch.configuration;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//https://wrallee.tistory.com/19?category=774840
@Configuration
@RequiredArgsConstructor
public class BatchConfiguration extends DefaultBatchConfigurer {
	private final DataSource dataSource;
	private final ApplicationContext applicationContext;

	@Bean(name = "sqlSessionNTSFactory")
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:/mappers/NTS/*.xml"));

		return sqlSessionFactoryBean.getObject();
	}

	@Bean(name = "sqlSessionNTS")
	public SqlSessionTemplate sqlSessionProduct(@Qualifier("sqlSessionNTSFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
		return sqlSessionTemplate;
	}
}
