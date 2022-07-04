package com.kks.txtest.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;

import com.kks.txtest.dao.H2TestDao;
import com.kks.txtest.dto.H2Test;

@Repository("mybatisH2TestDaoImpl")
public class MybatisH2TestDaoImpl implements H2TestDao{
	
	@Autowired
	@Qualifier(value="sampleSqlSession")
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@PostConstruct
	public void test() {
		System.out.println("MybatisH2TestDaoImpl constructed!!");
	}
	
	public void createTestTable() {
		// TODO Auto-generated method stub
		this.sqlSession.update("mybatis.sample.createH2TestTable");
	}

	public H2Test findH2Test(String id) {
		// TODO Auto-generated method stub
		return this.sqlSession.selectOne("mybatis.sample.selectH2Test", id);
	}

	public void registH2Test(H2Test dto) {
		// TODO Auto-generated method stub
		this.sqlSession.insert("mybatis.sample.insertH2Test", dto);
	}
	
}
