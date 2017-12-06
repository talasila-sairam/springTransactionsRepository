package com.annotation.java.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*This is the main class Here we need to Import the classes if you write more Configuration class to here by using Import annotation
 * ComponentScan annotation will tell by creating the IOC Container some classes are creating with the help of Annotation and we need
 * to provide this packages also 
 * EnableTransactionManagenet will helps in enableing the Transaction
 * */
@Configuration
@Import({PersistanceConfig.class})
@ComponentScan({"com.annotation.service" ,"com.annotation.controller"})
@EnableTransactionManagement
public class RootConfig {

}
