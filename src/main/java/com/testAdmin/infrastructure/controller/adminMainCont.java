package com.testAdmin.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String index(Model model)  {
		try {
			String strTodayOutbound = dbService.getTodayOutbound();
			model.addAttribute("todayOutbound", strTodayOutbound);
			logger.debug("Loading debug example logger "+ strTodayOutbound);
			logger.info("Loading info example logger "+ strTodayOutbound);
			//model.addAttribute("todayOutbound", "1500");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "../index";
	}
}
