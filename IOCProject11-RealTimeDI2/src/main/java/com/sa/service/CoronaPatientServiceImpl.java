package com.sa.service;

import com.sa.bo.CoronaPatientBO;
import com.sa.dao.ICoronaPatientDAO;
import com.sa.dto.CoronaPatientDTO;

public final class CoronaPatientServiceImpl implements ICoronaPatientService{
	
	private ICoronaPatientDAO dao;
	
	public CoronaPatientServiceImpl(ICoronaPatientDAO dao) {
		System.out.println("CoronaPatientServiceImpl :: 1-param constructor");
		this.dao=dao;
	}
	
	public String calculateAmount(CoronaPatientDTO dto) throws Exception{
		
		float discount=0.0f;
		int count=0;
		
		float billAmount= dto.getNoHospitalized()*dto.getBillPerDay();
		
		if(billAmount > 150000 && billAmount < 250000)
		    discount = .15f;
		else if(billAmount > 250000 && billAmount < 400000)
			discount = .25f;
		else if(billAmount > 400000)
			discount = .30f;
		
		float discountedAmount= billAmount * discount;
		float netBillAmount = billAmount - discountedAmount;
		
		//creating object for BO class
		
		CoronaPatientBO bo=new CoronaPatientBO();
		bo.setPatientName(dto.getPatientName());
		bo.setPatientAddrs(dto.getPatientAddrs());
		bo.setMobileNo(dto.getMobileNo());
		bo.setNoHospitalized(dto.getNoHospitalized());
		bo.setBillPerDay(dto.getBillPerDay());
		bo.setTotalBillAmount(billAmount);
		bo.setDiscount(discount);
		bo.setNetBillAmount(netBillAmount);
		
		count=dao.insert(bo);
		
		if(count == 1)
			return "CoronaPatient registor :: netBillAmount :: "+netBillAmount;
		else
			return "CoronaPatient not registor :: netBillAmount :: "+netBillAmount;
		
	}

}
