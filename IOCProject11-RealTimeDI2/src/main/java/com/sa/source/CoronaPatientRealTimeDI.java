package com.sa.source;


import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sa.controller.CoronaPatientController;
import com.sa.vo.CoronaPatientVO;

public class CoronaPatientRealTimeDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter corona patient name :: ");
		String name=sc.next();
		System.out.println("Enter corona patient addrs :: ");
		String addrs=sc.next();
		System.out.println("Enter corona patient mobile no :: ");
		String mobNo=sc.next();
		System.out.println("Enter corona patient num of hospitalized :: ");
		String noHospitalized=sc.next();
		System.out.println("Enter corona patient bill per day :: ");
		String billPerDay=sc.next();
		
		CoronaPatientVO vo=new CoronaPatientVO();
		vo.setPatientName(name);
		vo.setPatientAddrs(addrs);
		vo.setMobileNo(mobNo);
		vo.setNoHospitalized(noHospitalized);
		vo.setBillPerDay(billPerDay);
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/sa/cfgs/applicationContext.xml");
		CoronaPatientController controller=factory.getBean("coronaController",CoronaPatientController.class);
		
		try {
			String result=controller.process(vo);
			System.out.println("Result :: "+result);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error !!! Try agin -- "+e.getClass());
		}

	}

}
