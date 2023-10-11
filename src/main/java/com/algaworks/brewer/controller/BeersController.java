package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.algaworks.brewer.model.Beer;

@Controller
public class BeersController {
	
	@GetMapping(path = "/beers/start")
	public String start() {
		return "beers/BeersRegistration";
	}
	
	@PostMapping(path = "/beers/start")
	public String register(Beer beer) {
		System.out.println(">>> register SKU: " + beer.getSku());
		return "beers/BeersRegistration";
	}
	
}
