package com.testAdmin.infrastructure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testAdmin.infrastructure.dao.HelloDao;
import com.testAdmin.domain.entity.Hello;

@Controller
public class HelloRestController {
	@Autowired
	private HelloDao helloDao;
	
	@RequestMapping("/add")
	public String add(Hello hello, Model model)  {
		Hello helloData = helloDao.save(hello);
		model.addAttribute("helloData", helloData.getId());
		return "add";
	}
	
	@RequestMapping("/list")
	public List<Hello> list(Model model)  {
		List<Hello> helloList = helloDao.findAll();
		return helloList;
	}
	
	
	@RequestMapping("/")
	public String index1()  {
		return "../index";
		//return "Hello World!!!!!!";
	}
	
	
	@RequestMapping("/hello")
	public String index(Model model)  {
		//model.addAttribute("name", "SpringBoot test Administrator");
		return "hello";
	}
}
