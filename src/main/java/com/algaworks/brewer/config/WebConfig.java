package com.algaworks.brewer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.algaworks.brewer.controller.BeersController;

@Configuration
@ComponentScan(basePackageClasses = { BeersController.class })
@EnableWebMvc
public class WebConfig extends WebMvcConfigurationSupport{
	
}
