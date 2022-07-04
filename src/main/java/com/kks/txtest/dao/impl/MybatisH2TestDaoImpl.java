package com.kks.txtest.dao.impl;

import javax.annotation.PostConstruct;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.kks.txtest.dao.H2TestDao;
import com.kks.txtest.dto.H2Test;

@Repository
public class MybatisH2TestDaoImpl implements H2TestDao{
	
	@Autowired
	@Qualifier(value="sampleSqlSession")
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
	  this.sqlSession = sqlSession;
	}
	
	@PostConstruct
	public void test() {
		System.out.println("dao test constructed!!");
	}
	
	public String connTest() {
		return this.sqlSession.selectOne("daoTest.selectConnSuccessMsg");
	}

	public void createTestTable() {
		// TODO Auto-generated method stub
		
	}

	public H2Test findH2Test(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void registH2Test(H2Test dto) {
		// TODO Auto-generated method stub
		
	}
	
}
