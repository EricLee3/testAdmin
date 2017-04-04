package com.testAdmin.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.testAdmin.repository.LoginUserDetails;
import com.testAdmin.repository.entity.TUsers;

@Service
public class LoginUserDetailsService implements UserDetailsService {
	@Autowired
	UserService userService;

	//@Autowired
	//private HttpServletRequest request;
	
	@Override
	public UserDetails loadUserByUsername(String ac) throws UsernameNotFoundException  {
		TUsers users = userService.getAccount(ac);
		
		if (users == null)  {
			throw new UsernameNotFoundException("login fail");
		}
		return new LoginUserDetails(users);
	}
}
