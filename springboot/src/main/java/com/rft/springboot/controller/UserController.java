package com.rft.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rft.springboot.entity.User;
import com.rft.springboot.repository.UserRepository;

@EntityScan("com.rft.springboot.entity")
@EnableJpaRepositories("com.rft.springboot.repository")
@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/{id}")
	public User view(@PathVariable("id") Long id){
		return userRepository.findOne(id);
	}
	
	@RequestMapping("/all")
	@ResponseBody
	Iterable<User> get(){
		return userRepository.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(UserController.class, args);
	}
}
