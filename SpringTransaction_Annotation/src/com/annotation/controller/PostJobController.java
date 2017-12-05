package com.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.annotation.command.JobCommand;
import com.annotation.service.JobService;

@Controller
public class PostJobController {
	@Autowired
	private JobService jobService;
	
	public void execute(JobCommand jobCommand) {
		System.out.println("inside execute method");
		jobService.postJob(jobCommand);
	}
}
