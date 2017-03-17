package com.testAdmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testAdmin.dao.DbMapper;

@Service
public class DbService {
	@Autowired
	DbMapper dbMapper;
	
	// needed to get a meaning of this annotation 
	// @Transactional(propagation=Propagation.REQUIRED, rollbackFor={Exception.class})
	public String getDual() throws Exception  {
		return dbMapper.getDual();
	}
}
