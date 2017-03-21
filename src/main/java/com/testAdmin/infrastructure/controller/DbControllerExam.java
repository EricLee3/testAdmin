package com.testAdmin.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.testAdmin.service.DbService;

@RestController
public class DbControllerExam {
	@Autowired
	DbService dbService;
	
	@RequestMapping("/now")
	public @ResponseBody String now() throws Exception  {
		return dbService.getDual();
	}
	
	public String getTodayOutbound() throws Exception  {
		return dbService.getTodayOutbound();
	}
}
