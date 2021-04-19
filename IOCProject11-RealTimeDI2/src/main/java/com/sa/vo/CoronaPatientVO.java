package com.sa.vo;

public class CoronaPatientVO {
	
	private String patientName;
	private String patientAddrs;
	private String mobileNo;
	private String noHospitalized;
	private String billPerDay;
	
	
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getNoHospitalized() {
		return noHospitalized;
	}
	public void setNoHospitalized(String noHospitalized) {
		this.noHospitalized = noHospitalized;
	}
	public String getBillPerDay() {
		return billPerDay;
	}
	public void setBillPerDay(String billPerDay) {
		this.billPerDay = billPerDay;
	}
	
	@Override
	public String toString() {
		return "CoronaPatientVO [patientName=" + patientName + ", patientAddrs=" + patientAddrs + ", mobileNo="
				+ mobileNo + ", noHospitalized=" + noHospitalized + ", billPerDay=" + billPerDay + "]";
	}
	
	

}
