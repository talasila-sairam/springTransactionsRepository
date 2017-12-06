package com.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotation.command.JobCommand;
import com.annotation.controller.PostJobController;
import com.annotation.java.config.RootConfig;
/*Here we are creating ApplicationContext through Complete java Config file and Annotations.here we need to pass java config file to create it*/
public class PostJobTest {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
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
