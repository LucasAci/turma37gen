package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class Hello2 {
	
	@GetMapping
	public String hello2( ) {
		return "Meus opjetivos de aprendizagem durante essa semana é aprender Srpingboot.";
	}
	

}
