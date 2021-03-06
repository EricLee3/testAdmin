package com.testAdmin.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testAdmin.repository.entity.User;
import com.testAdmin.service.DbService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
public class adminMainCont {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	DbService dbService;
	
	@Autowired
	User user;

	@RequestMapping({"/", "index"})
	public String index(Model model, User user)  {
		try {
			// Login user name 
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			String userName = auth.getName();
			model.addAttribute("userName", userName);
			
			// outbound No for Linegraph 
			String strTodayOutbound = dbService.getTodayOutbound();
			model.addAttribute("todayOutbound", strTodayOutbound);
			
			logger.debug("Loading debug example logger "+ strTodayOutbound);
			logger.info("Loading info example logger "+ strTodayOutbound);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "../index";
	}
	
	@RequestMapping({"test"})
	public String test(Model model)  {
		return "chartjs2";
	}
}
