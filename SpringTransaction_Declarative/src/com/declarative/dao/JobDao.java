package com.declarative.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.declarative.bo.JobBo;
/* Here we are performing the persistence operation on job table.And we are writing the 
 * SQL Query here itself.and we are providing the NamedparameterJdbcTemplate
 * So that we can match Bo class with substitute parameters by using BeanPropertySqlParameter class*/
public class JobDao {
private static String SQL_INSERT_JOB ="insert into sys.job(job_no ,title ,description ,qualification ,experience ,company_id) values(:jobNo ,:title ,:description ,:qualification ,:experience ,:companyId)";
private NamedParameterJdbcTemplate namedJdbcTemplate;

public int saveJob(JobBo jobBo) {
	System.out.println("inside save job method of JobDao class");
	int ret = 0;
	ret = namedJdbcTemplate.update(SQL_INSERT_JOB,new BeanPropertySqlParameterSource(jobBo));
	return ret;
}

public NamedParameterJdbcTemplate getNamedJdbcTemplate() {
	return namedJdbcTemplate;
}

public void setNamedJdbcTemplate(NamedParameterJdbcTemplate namedJdbcTemplate) {
	this.namedJdbcTemplate = namedJdbcTemplate;
}
}
