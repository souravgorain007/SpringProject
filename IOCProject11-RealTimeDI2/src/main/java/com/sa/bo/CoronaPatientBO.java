package com.sa.bo;

public class CoronaPatientBO {
	
	private String patientName;
	private String patientAddrs;
	private Long mobileNo;
	private Integer noHospitalized;
	private Float billPerDay;
	private Float totalBillAmount;
	private Float discount;
	private Float netBillAmount;
	
	
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
	public Float getTotalBillAmount() {
		return totalBillAmount;
	}
	public void setTotalBillAmount(Float totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}
	public Float getDiscount() {
		return discount;
	}
	public void setDiscount(Float discount) {
		this.discount = discount;
	}
	public Float getNetBillAmount() {
		return netBillAmount;
	}
	public void setNetBillAmount(Float netBillAmount) {
		this.netBillAmount = netBillAmount;
	}
	@Override
	public String toString() {
		return "CoronaPatientBO [patientName=" + patientName + ", patientAddrs=" + patientAddrs + ", mobileNo="
				+ mobileNo + ", noHospitalized=" + noHospitalized + ", billPerDay=" + billPerDay + ", totalBillAmount="
				+ totalBillAmount + ", discount=" + discount + ", netBillAmount=" + netBillAmount + "]";
	}
	
	

}
