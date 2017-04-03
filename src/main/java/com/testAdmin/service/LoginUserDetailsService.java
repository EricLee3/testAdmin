package com.testAdmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.testAdmin.repository.LoginUserDetails;
import com.testAdmin.repository.entity.Users;

@Service
public class LoginUserDetailsService implements UserDetailsService {
	@Autowired
	UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String ac) throws UsernameNotFoundException  {
		Users users = userService.getAccount(ac);
		
		if (users == null)  {
			throw new UsernameNotFoundException("login fail");
		}
		return new LoginUserDetails(users);
	}
}
