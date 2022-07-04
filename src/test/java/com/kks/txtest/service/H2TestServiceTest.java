package com.kks.txtest.service;

import com.kks.txtest.context.AppContextHolder;
import com.kks.txtest.dto.H2Test;

public class H2TestServiceTest {
	
	public static void main(String[] args) {
		System.out.println("*** App start ***");
		H2TestService svc = (H2TestService) AppContextHolder.getApplicationContext().getBean("h2TestService");
		
		System.out.println("create table if not exist.");
		svc.createH2TestTable();
		
		H2Test dto = new H2Test();
		String id = "kks1";
		dto.setId(id);
		dto.setName("kisoon");
		dto.setSeq(3);
	
		System.out.println("add H2Test: " + dto);
		svc.addH2Test(dto);
		
		System.out.println("get H2Test by id: " + id);
		H2Test result = svc.getH2Test(id);
		System.out.println("get h2Test result: " + result);
		
		System.out.println("*** App end ***");
	}
	
}
