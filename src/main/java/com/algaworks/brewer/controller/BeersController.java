package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BeersController {
	
	@RequestMapping(path = "/beers/start")
	public String start() {
		return "beers/BeersRegistration";
	}
	
}
