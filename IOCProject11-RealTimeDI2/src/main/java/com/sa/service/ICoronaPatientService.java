package com.sa.service;

import com.sa.dto.CoronaPatientDTO;

public interface ICoronaPatientService {
	
	public String calculateAmount(CoronaPatientDTO dto)throws Exception;

}
