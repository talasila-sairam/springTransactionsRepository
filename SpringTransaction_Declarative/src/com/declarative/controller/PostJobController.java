package com.declarative.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.declarative.command.JobCommand;
import com.declarative.service.JobService;

/*This is controller class and it will talks with Services by passing command object that is comming from jsp*/
public class PostJobController {
	
	public JobService getJobService() {
		return jobService;
	}

	public void setJobService(JobService jobService) {
		this.jobService = jobService;
	}

	private JobService jobService;
	
	public void execute(JobCommand jobCommand) {
		System.out.println("inside execute method");
		jobService.postJob(jobCommand);
	}
}
