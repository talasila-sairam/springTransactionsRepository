package com.tx.app.entity;

public class Job {
	private int jobId;
	private String experience;
	private String qualification;
	private String jobType;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", experience=" + experience + ", qualification=" + qualification + ", jobType="
				+ jobType + "]";
	}
	

}
