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
	public String start() {
		return "beers/BeersRegistration";
	}
	
	@PostMapping(path = "/beers/starting")
	public String register(@Valid Beer beer, BindingResult result,
		Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			model.addAttribute("message", "Error in form.");
			System.out.println(">>> contains errors");
			return "beers/BeersRegistration";
		}
		attributes.addFlashAttribute("message", "Beer save with success.");
		System.out.println(">>> register SKU: " + beer.getSku());
		return "redirect:/beers/starting";
	}
	
}
