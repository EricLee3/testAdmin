package com.testAdmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.testAdmin.dao.TUsersRepository;
import com.testAdmin.repository.entity.TUsers;

@Component
public class UserService {
	@Autowired
	private TUsersRepository usersRepository;
	
	public TUsers getAccount(String ac)  {
		return usersRepository.findOneByAc(ac);
	}
}
