package com.kks.txtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kks.txtest.dto.H2Test;
import com.kks.txtest.mybatis.mapper.MybatisH2TestMapper;

import lombok.Setter;

@Service
public class MybatisMapperH2TestService {
	
	
	@Setter(onMethod_ = {@Autowired, @Qualifier("mybatisH2TestMapper")})
	private MybatisH2TestMapper mapper;
	
	public void createH2TestTable() {
		this.mapper.createTestTable();
	}
	
	public void addH2Test(H2Test dto) {
		this.mapper.registH2Test(dto);
	}
	
	public List<H2Test> getH2TestList(String id) {
		return this.mapper.findH2TestList(id);
	}

}
