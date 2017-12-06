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

import com.annotation.dao.CompanyDao;
import com.annotation.dao.JobDao;

/*This class is usefull for making the persistence support classes as beans inside ioc container
 * Configuration annotation will make our class as JavaConfiguration class
 * PropertySource annotation will used to get the dynamic values from the Properties file.using spring expressions
 * Component scan will tell while creating ioc container some beans are configured with Annotations that package name we have to write
 * */
@Configuration
@PropertySource("classpath:com/annotation/properties/db.properties")
@ComponentScan({"com.annotation.dao"})
public class PersistanceConfig {
	
	/*Here we are using Environment class object.property Resource Annotation will read all the properties from Properties 
	 * file it will place inside the Environment Variable.so we can read the values from Environment Variable.Incase odf 
	 * username attribute if you provide inside properties file,with the sanme name it will read from local system username.
	 * it will over ride the my sql value  
	*/
    @Autowired
	Environment environment;
    
	//This Bean Tag is used to make this calss as bean inside the IOC Container here method name is the Bean Name
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
    
    /* Here we are making Resource Manager as Bean inside the IOC Container this clas having the dependency
    That will be automatically injected but we have to provide autowire = Autowire.BY_TYPE */
    
    @Bean(autowire= Autowire.BY_TYPE)
    public ResourceTransactionManager newTransactionManager() {
    	ResourceTransactionManager reSourceTxManager = null;
    	reSourceTxManager = new DataSourceTransactionManager();
    	return reSourceTxManager;
    }
    
    /*Here we are making the JdbcTemplate as Bean inside the IOC Container for this we need to pass the DataSource as Dependent
     * We can achieve this by enableing the Auto wire by type.but this injection will be happen through setter not through constructor
     * bcz here we are creationg the bean not by IOC Container so we need to manage every thing thai is the reason we are unable to create 
     * NamedParameterJdbcTemplate class
     * */
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
