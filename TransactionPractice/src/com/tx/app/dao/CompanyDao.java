package com.tx.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.tx.app.entity.Company;
import com.tx.app.entity.Job;

@Component("companyDao")
public class CompanyDao {
	@Autowired
	private NamedParameterJdbcTemplate jt;
	private static final String INSERT_QUERY="INSERT INTO company_tbl(COMPANY_ID,COMPANY_NAME,ADDRESS,JOB_ID) VALUES(:companyId,:companyName,:address,:jobId)";
	
	public void saveCompany(Company company){
		System.out.println("starting companyDao method");
		BeanPropertySqlParameterSource params=new BeanPropertySqlParameterSource(company);		
		jt.update(INSERT_QUERY, params);
		System.out.println("ending companyDao method");
	}
}
