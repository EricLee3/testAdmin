package com.testAdmin.repository;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import com.testAdmin.repository.entity.Users;
import lombok.Getter;


public class LoginUserDetails extends User {
	private static final long serialVersionUID = 1L;

	@Getter
	private long no;
	
	public LoginUserDetails(Users users)  {
		super(users.getAc(), users.getPw(), AuthorityUtils.createAuthorityList(users.getRole()));
		no = users.getNo();
	}
}
