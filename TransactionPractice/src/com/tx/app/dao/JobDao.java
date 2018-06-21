package com.tx.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.tx.app.entity.Job;

@Component("jobDao")
public class JobDao {
	@Autowired
	private NamedParameterJdbcTemplate jt;
	private static final String INSERT_QUERY="INSERT INTO job_tbl(JOB_ID,EXPERIENCE,QUALIFICATION,JOB_TYPE) VALUES(:jobId,:experience,:qualification,:jobType)";
	
	public void saveJob(Job job){
		System.out.println("starting jobDao method");
		BeanPropertySqlParameterSource params=new BeanPropertySqlParameterSource(job);		
		jt.update(INSERT_QUERY, params);
		System.out.println("ending jobDao method");
	}
}
