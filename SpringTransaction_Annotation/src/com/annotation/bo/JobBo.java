package com.annotation.bo;

/* This is the Bussiness object which can be used to perform the persistence operation
* This object should be same as database table.The data that is  comming from VO or Command/Form
* should contain the data but some times we need to add more data to the datble apart from command 
* object data in taht case we will create Bussiness Object and will populate entire data into it and 
* this object will be transfered to Persistence tier Here JobBo object is derived from JobCommand Object
*  this class contain entire Comany Details and Job Details
* */

public class JobBo {
	private int jobNo;
	private String title;
	private String description;
	private String qualification;
	private int experience;
	private int companyId;
	public int getJobNo() {
		return jobNo;
	}
	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
}
