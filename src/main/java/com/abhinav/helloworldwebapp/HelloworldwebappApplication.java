package com.abhinav.helloworldwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.abhinav.helloworldwebappcontroller")
public class HelloworldwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldwebappApplication.class, args);
	}

}
