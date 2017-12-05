package com.annotation.java.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.support.ResourceTransactionManager;

import com.declarative.dao.CompanyDao;
import com.declarative.dao.JobDao;

@Configuration
@PropertySource("classpath:com/annotation/properties/db.properties")
@ComponentScan({"com.annotation.dao"})
public class PersistanceConfig {
	
    @Autowired
	Environment environment;
    
	
    @Bean
	public DataSource newDataSource() {
		DataSource dataSource = null;
		System.out.println(environment);
		System.out.println(environment.getProperty("url"));
		System.out.println(environment.getProperty("password"));
		System.out.println(environment.getProperty("mysqlusername"));
		dataSource = new DriverManagerDataSource(environment.getProperty("url"),environment.getProperty("mysqlusername"),environment.getProperty("password"));
		return dataSource;
	}
    
    @Bean(autowire= Autowire.BY_TYPE)
    public ResourceTransactionManager newTransactionManager() {
    	ResourceTransactionManager reSourceTxManager = null;
    	reSourceTxManager = new DataSourceTransactionManager();
    	return reSourceTxManager;
    }
    
    @Bean(autowire = Autowire.BY_TYPE)
    public JdbcTemplate newJdbcTemplate() {
    	JdbcTemplate jdbcTemplate = null;
    	jdbcTemplate = new JdbcTemplate();
    	return jdbcTemplate;
    }
    
   /* @Bean(name = {"jobDao"}, autowire = Autowire.BY_TYPE)
    public JobDao newJobDao() {
    	JobDao jobDao = null;
    	jobDao = new JobDao();
    	return jobDao;
    }
    
    @Bean(name = {"companyDao"} ,autowire = Autowire.BY_TYPE)
    public CompanyDao newCompanyDao() {
    	CompanyDao companyDao = null;
    	companyDao = new CompanyDao();
    	return companyDao;
    }*/
}
