package com.kks.txtest.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.kks.txtest.dao.H2TestDao;
import com.kks.txtest.dto.H2Test;

@Repository("h2TestDaoImpl")
public class H2TestDaoImpl extends SqlMapClientDaoSupport implements H2TestDao  {

	@Autowired
	@Qualifier("testH2SqlMapClient")
	public void injectSqlMapClient(SqlMapClient sqlMapClient) {
		this.setSqlMapClient(sqlMapClient);
	}
	
	public void createTestTable() {
		this.getSqlMapClientTemplate().update("h2test.createH2TestTable");		
	}

	public H2Test findH2Test(String id) {
		// TODO Auto-generated method stub
		H2Test dto = (H2Test) this.getSqlMapClientTemplate().queryForObject("h2test.selectH2Test", id);
		return dto;
	}

	public void registH2Test(H2Test dto) {
		// TODO Auto-generated method stub
		this.getSqlMapClientTemplate().insert("h2test.insertH2Test", dto);
	}

}
