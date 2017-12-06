package com.declarative.bo;

/* This is the Bussiness object which can be used to perform the persistence operation
 * This object should be same as database table.The data that is  comming from VO or Command/Form
 * should contain the data but some times we need to add more data to the datble apart from command object data
 * in taht case we will create Bussiness Object and will populate entire data into it and this object will be transfered to Persistence tier
 * Here JobBo object is derived from JobCommand Object this class contain entire Comany Details and Job Details
 * */
public class CompanyBo {
	private int companyId;
	private String location;
	private String companyName;
	private String serviceType;
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
