package com.declarative.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.java.config.RootConfig;
import com.declarative.command.JobCommand;
import com.declarative.controller.PostJobController;

public class PostJobTest {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/declarative/common/application-context.xml");
	System.out.println("Inside main method");
	JobCommand jobCommand = null;
	jobCommand = new JobCommand();
	jobCommand.setJobNo(100);
	jobCommand.setTitle("SeniorSoftwereEnginer");
	jobCommand.setDescription("HandlingProjects");
	jobCommand.setQualification("MCA");
    jobCommand.setExperience(5);
    jobCommand.setCompanyId(1);
    jobCommand.setCompanyName("TataConsultencyService");
    jobCommand.setServiceType("ServiceBased");
    jobCommand.setLocation("Hyderabad");
    PostJobController postJobController = context.getBean("postJobController",PostJobController.class);
    postJobController.execute(jobCommand);
    System.out.println("job updated sucessfully");
}
}
