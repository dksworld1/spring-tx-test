package com.kks.txtest.dao;

import com.kks.txtest.dto.H2Test;

public interface H2TestDao {
	public void createTestTable();
	public H2Test findH2Test(String id);
	public void registH2Test(H2Test dto);
}
