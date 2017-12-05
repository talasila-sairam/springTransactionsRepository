package com.declarative.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.declarative.bo.CompanyBo;
import com.declarative.bo.JobBo;


public class CompanyDao {
	
	private static String  SQL_INSERT_COMPANY = "insert into sys.company(company_id ,location ,company_name ,service_type) values(:companyId ,:location ,:location ,:serviceType)";
	private NamedParameterJdbcTemplate namedJdbcTemplate;
	
	public NamedParameterJdbcTemplate getNamedJdbcTemplate() {
		return namedJdbcTemplate;
	}

	public void setNamedJdbcTemplate(NamedParameterJdbcTemplate namedJdbcTemplate) {
		this.namedJdbcTemplate = namedJdbcTemplate;
	}

    public int saveCompany(CompanyBo companyBo) {
    	System.out.println("inside save company method of CompanyDao class");
    	int ret = 0;
    	ret = namedJdbcTemplate.update(SQL_INSERT_COMPANY, new BeanPropertySqlParameterSource(companyBo));
    	return ret;
    }
}
