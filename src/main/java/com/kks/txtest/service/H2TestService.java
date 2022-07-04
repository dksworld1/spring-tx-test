package com.kks.txtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kks.txtest.dao.H2TestDao;
import com.kks.txtest.dto.H2Test;

@Service
public class H2TestService {
	
	@Autowired
	@Qualifier("h2TestDaoImpl")
	private H2TestDao dao;
	
	public void createH2TestTable() {
		this.dao.createTestTable();
	}
	
	public void addH2Test(H2Test dto) {
		this.dao.registH2Test(dto);
	}
	
	public H2Test getH2Test(String id) {
		return this.dao.findH2Test(id);
	}

}
