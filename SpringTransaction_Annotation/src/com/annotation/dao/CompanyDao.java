package com.annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.annotation.bo.CompanyBo;
import com.annotation.bo.JobBo;

@Repository
public class CompanyDao {
	
	private static String  SQL_INSERT_COMPANY = "insert into sys.company(company_id ,location ,company_name ,service_type) values(? ,? ,? ,?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    public int saveCompany(CompanyBo companyBo) {
    	System.out.println("inside save company method of CompanyDao class");
    	int ret = 0;
    	ret = jdbcTemplate.update(SQL_INSERT_COMPANY, new Object[] {companyBo.getCompanyId() ,companyBo.getLocation() ,companyBo.getCompanyName() ,companyBo.getServiceType()});
    	return ret;
    }
}
