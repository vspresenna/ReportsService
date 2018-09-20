package com.sainsburys.analytics.demo.vo;

import java.io.Serializable;

public class ResponseObject<T> implements Serializable {

	private static final long serialVersionUID = -8486538304210707897L;
	private Integer responseCode;
	private String responseDescription;
	private T responseData;
	
	public ResponseObject(Integer responseCode, String responseDescription, T responseData) {
		super();
		this.responseCode = responseCode;
		this.responseDescription = responseDescription;
		this.responseData = responseData;
	}
	
	public Integer getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDescription() {
		return responseDescription;
	}
	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}
	public T getResponseData() {
		return responseData;
	}
	public void setResponseData(T responseData) {
		this.responseData = responseData;
	}
	
}
