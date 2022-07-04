package com.kks.txtest.mybatis.mapper;

import java.util.List;

import com.kks.txtest.dto.H2Test;

public interface MybatisH2TestMapper {
	public void createTestTable();
	public List<H2Test> findH2TestList(String id);
	public void registH2Test(H2Test dto);
}
