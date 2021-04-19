package com.sa.controller;

import com.sa.dto.CoronaPatientDTO;
import com.sa.service.ICoronaPatientService;
import com.sa.vo.CoronaPatientVO;

public class CoronaPatientController {
	
	private ICoronaPatientService service;
	
	public CoronaPatientController(ICoronaPatientService service) {
		System.out.println("CoronaPatientController :: 1-param constructor");
		this.service=service;
	}
	
	public String process(CoronaPatientVO vo)throws Exception{
		
		//creating object of DTO class
		
		CoronaPatientDTO dto=new CoronaPatientDTO();
		
		dto.setPatientName(vo.getPatientName());
		dto.setPatientAddrs(vo.getPatientAddrs());
		dto.setMobileNo(Long.parseLong(vo.getMobileNo()));
		dto.setNoHospitalized(Integer.parseInt(vo.getNoHospitalized()));
		dto.setBillPerDay(Float.parseFloat(vo.getBillPerDay()));
		
		String result=service.calculateAmount(dto);
		return result;
		
	}

}
