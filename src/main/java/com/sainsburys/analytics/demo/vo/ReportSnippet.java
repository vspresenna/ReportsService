package com.sainsburys.analytics.demo.vo;

import java.io.Serializable;

public class ReportSnippet implements Serializable {
	
	private static final long serialVersionUID = 4548793040862544640L;
	
	private String reportId;
	private String name;
	private String jobId;
	private String creator;
	private String type;
	private String lastModified;
	
	public ReportSnippet(String reportId, String name, String jobId, String creator, String type, String lastModified) {
		super();
		this.reportId = reportId;
		this.name = name;
		this.jobId = jobId;
		this.creator = creator;
		this.type = type;
		this.lastModified = lastModified;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLastModified() {
		return lastModified;
	}
	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
}
