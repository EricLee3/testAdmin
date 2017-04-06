package com.testAdmin.configuration;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
 
import com.testAdmin.service.UserService;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter  {
	@Autowired
	UserService userService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception  {
		http
			.csrf()	// Cross Site Request Forgery
			.disable().authorizeRequests().anyRequest().authenticated().and().formLogin();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception  {
		auth.userDetailsService(userService);
	}
}
