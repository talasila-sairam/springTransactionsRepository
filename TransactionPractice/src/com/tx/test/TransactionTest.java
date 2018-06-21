package com.tx.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tx.app.entity.Company;
import com.tx.app.entity.Job;
import com.tx.app.service.CompanyJobService;

public class TransactionTest {

	public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com\\tx\\app\\config\\application-config.xml");
	
		Job job=new Job();
		job.setExperience("10yrs");
		job.setJobId(200);
		job.setJobType("sw");
		job.setQualification("MCA");
		
		Company company = new Company();
		company.setCompanyId(1456);
		company.setCompanyName("Appstek");
		company.setAddress("Hyderabad");
		company.setJobId(200);
		
		CompanyJobService companyJobService = context.getBean("companyJobService",CompanyJobService.class);
		companyJobService.saveJobAndCompany(job, company);
		System.out.println("end of the main method");

	}

}
