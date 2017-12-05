package com.annotation.java.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import({PersistanceConfig.class})
@ComponentScan({"com.annotation.service" ,"com.annotation.controller"})
@EnableTransactionManagement
public class RootConfig {

}
