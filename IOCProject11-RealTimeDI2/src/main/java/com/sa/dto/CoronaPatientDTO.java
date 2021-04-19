package com.sa.dto;

import java.io.Serializable;

public class CoronaPatientDTO implements Serializable{
	
	private String patientName;
	private String patientAddrs;
	private Long mobileNo;
	private Integer noHospitalized;
	private Float billPerDay;
	
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAddrs() {
		return patientAddrs;
	}
	public void setPatientAddrs(String patientAddrs) {
		this.patientAddrs = patientAddrs;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Integer getNoHospitalized() {
		return noHospitalized;
	}
	public void setNoHospitalized(Integer noHospitalized) {
		this.noHospitalized = noHospitalized;
	}
	public Float getBillPerDay() {
		return billPerDay;
	}
	public void setBillPerDay(Float billPerDay) {
		this.billPerDay = billPerDay;
	}
	@Override
	public String toString() {
		return "CoronaPatientDTO [patientName=" + patientName + ", patientAddrs=" + patientAddrs + ", mobileNo="
				+ mobileNo + ", noHospitalized=" + noHospitalized + ", billPerDay=" + billPerDay + "]";
	}
	
	

}
