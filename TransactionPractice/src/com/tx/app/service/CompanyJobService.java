package com.tx.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tx.app.dao.CompanyDao;
import com.tx.app.dao.JobDao;
import com.tx.app.entity.Company;
import com.tx.app.entity.Job;

@Component("companyJobService")
public class CompanyJobService {
	
	@Autowired
	JobDao jobDao;
	
	@Autowired
	CompanyDao companyDao;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void saveJobAndCompany(Job job ,Company company) {
		System.out.println("starting CompanyJobService method");
		jobDao.saveJob(job);
		companyDao.saveCompany(company);
		System.out.println("ending CompanyJobService method");
	}

}
