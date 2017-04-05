package com.testAdmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testAdmin.dao.UserMapper;
import com.testAdmin.repository.entity.User;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	
	// needed to get a meaning of this annotation 
	// @Transactional(propagation=Propagation.REQUIRED, rollbackFor={Exception.class})
	public User readUser(String username) throws Exception  {
		return userMapper.readUser(username);
	}
	
	public List<String> readAuthority(String username) throws Exception {
		return userMapper.readAuthority(username);
	}
}

