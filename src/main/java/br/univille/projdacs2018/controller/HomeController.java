package br.univille.projdacs2018.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.spring5.view.ThymeleafView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "{\"name\":\"Stocker\"}";
	}
}
