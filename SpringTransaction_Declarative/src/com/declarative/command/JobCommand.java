package com.declarative.command;

/*This Object will carry the entire data i.e comming from JSP Form it is a pojo calss
 * and we can send this object from one layer to another layer.because as it is pojofied
 * Incase of struts it is a actionfrom class.incase of Springs it is Pojo class only
 * */
public class JobCommand {
private int jobNo;
private String title;
private String description;
private String qualification;
private int experience;
private int companyId;
private String location;
private String companyName;
private String serviceType;
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
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getServiceType() {
	return serviceType;
}
public void setServiceType(String serviceType) {
	this.serviceType = serviceType;
}
}
