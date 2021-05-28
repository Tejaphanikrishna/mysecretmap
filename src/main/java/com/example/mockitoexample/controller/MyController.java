package com.example.mockitoexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class MyController {
	@GetMapping("/")
	public String teja() {
		return "Hi Teja";
	}

}
