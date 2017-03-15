package com.testAdmin.infrastructure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class adminMainCont {
	@RequestMapping({"/", "index"})
	public String index()  {
		return "../index";
	}
}
