package com.testAdmin.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testAdmin.service.DbService;


@Controller
public class adminMainCont {
	@Autowired
	DbService dbService;
	
	@RequestMapping({"/", "index"})
	public String index(Model model)  {
		try {
			String strTodayOutbound = dbService.getTodayOutbound();
			model.addAttribute("todayOutbound", strTodayOutbound);
			//model.addAttribute("todayOutbound", "1500");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "../index";
	}
}
