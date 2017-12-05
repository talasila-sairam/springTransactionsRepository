package com.annotation.dao;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.annotation.bo.CompanyBo;
import com.annotation.bo.JobBo;
@Repository
public class JobDao {
private static String SQL_INSERT_JOB ="insert into sys.job(job_no ,title ,description ,qualification ,experience ,company_id) values(?,?,?,?,?,?)";
@Autowired
private JdbcTemplate jdbcTemplate;

public int saveJob(JobBo jobBo) {
	System.out.println("inside save job method of JobDao class");
	int ret = 0;
	ret = jdbcTemplate.update(SQL_INSERT_JOB, new Object[] {jobBo.getJobNo() ,jobBo.getTitle() ,jobBo.getDescription() ,jobBo.getQualification() ,jobBo.getExperience() ,jobBo.getCompanyId()});
	return ret;
}
}
