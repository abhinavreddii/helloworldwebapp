package com.abhinav.helloworldwebappcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class webappcontroller {
	@GetMapping("/")
	public String hello() {
		return "Hello World!";
	}
	@GetMapping("/next")
	public String ne() {
		return "next page is loaded";
	}
}
