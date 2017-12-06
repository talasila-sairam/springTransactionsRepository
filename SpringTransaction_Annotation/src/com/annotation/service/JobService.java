package com.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.annotation.bo.CompanyBo;
import com.annotation.bo.JobBo;
import com.annotation.command.JobCommand;
import com.annotation.dao.CompanyDao;
import com.annotation.dao.JobDao;

/*This annotation will makes this class as bean inside the IOC Container
 * Service classes communicate with Service classes so it required these 
 * two classes as dependent this can be resolved by writing the Autowired annotation
 * */
@Service
public class JobService {
	@Autowired
    private JobDao jobDao;
	@Autowired
    private CompanyDao companyDao;
	
	/*This annotation will helps this method participating in Transactions bcz here we are not writing any pointcut.bcz if you wuse annotations you 
	 * will specify pointcut by writing around or before or after annotation on top if it.but incase we no need to write any thing internally it 
	 * will identify by using This annotation Transactional.In Declarative approach we will specify pointcut but incase of Annotations it will identify
	 * by this annotation
	 * */
    @Transactional(readOnly=false)
	public void postJob(JobCommand jobCommand) {
		System.out.println("inside sevice class of postJob method");
		JobBo jobBo = null;
		jobBo = new JobBo();
		//jobBo.setCompanyId(jobCommand.getCompanyId());
		jobBo.setCompanyId(2);
		jobBo.setDescription(jobCommand.getDescription());
		jobBo.setExperience(jobCommand.getExperience());
		jobBo.setJobNo(jobCommand.getJobNo());
		jobBo.setQualification(jobCommand.getQualification());
		jobBo.setTitle(jobCommand.getTitle());
		
		CompanyBo companyBo = null;
		companyBo = new CompanyBo();
		companyBo.setCompanyId(jobCommand.getCompanyId());
		companyBo.setCompanyName(jobCommand.getCompanyName());
		companyBo.setLocation(jobCommand.getLocation());
		companyBo.setServiceType(jobCommand.getServiceType());
		System.out.println("inside service class of post job method 2");
		int companyRet = companyDao.saveCompany(companyBo);
		int jobRet = jobDao.saveJob(jobBo);
		System.out.println("Job Inserted "+jobRet);
		System.out.println("Company Inserted "+companyRet);
		System.out.println("insidce JobService method");
		
	}

}
