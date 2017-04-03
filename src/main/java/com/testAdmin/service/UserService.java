package com.testAdmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.testAdmin.dao.UsersRepository;
import com.testAdmin.repository.entity.Users;

@Component
public class UserService {
	@Autowired
	UsersRepository usersRepository;
	
	public Users getAccount(String ac)  {
		return usersRepository.findOneByAc(ac);
	}
}
