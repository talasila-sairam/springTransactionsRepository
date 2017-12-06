package com.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.annotation.command.JobCommand;
import com.annotation.service.JobService;

/*Here we are declaring it as Controller instead of configuring it as bean inside spring bean configuration file
 * Making Completely Annotation driven Devlopment
 * */
@Controller
public class PostJobController {
	/*Controller need to communicate with the sevice so autowired annotation will resolve this dependency */
	@Autowired
	private JobService jobService;
	
	public void execute(JobCommand jobCommand) {
		System.out.println("inside execute method");
		jobService.postJob(jobCommand);
	}
}
