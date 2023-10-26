package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Beer;

import jakarta.validation.Valid;

@Controller
public class BeersController {
	
	@GetMapping(path = "/beers/starting")
	public String start(Beer beer) {
		return "beers/BeersRegistration";
	}
	
	@PostMapping(path = "/beers/starting")
	public String register(@Valid Beer beer, BindingResult result, Model model,
		RedirectAttributes attributes) {
		String attributeName = "message";
		if (result.hasErrors()) {
			return start(beer);
		}
		attributes.addFlashAttribute(attributeName, "Beer save with success.");
		System.out.println(">>> register SKU: " + beer.getSku());
		return "redirect:/beers/starting";
	}
	
	@GetMapping(path = "/beers/create")
	public String create() {
		return "beers/productRegistration";
	}
	
}
