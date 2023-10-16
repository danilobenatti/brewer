package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.algaworks.brewer.model.Beer;

import jakarta.validation.Valid;

@Controller
public class BeersController {
	
	@GetMapping(path = "/beers/starting")
	public String start() {
		return "beers/BeersRegistration";
	}
	
	@PostMapping(path = "/beers/starting")
	public String register(@Valid Beer beer, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(">>> contains errors");
		}
		System.out.println(">>> register SKU: " + beer.getSku());
		return "beers/BeersRegistration";
	}
	
}
