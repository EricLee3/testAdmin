package com.testAdmin.configuration;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

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
		http
			.logout()
			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/");
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception  {
		auth.userDetailsService(userService);
	}
}
