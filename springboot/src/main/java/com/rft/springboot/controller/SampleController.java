package com.rft.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/sample")
	public String hello(){
		return "sample";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, args);
	}
	
}
