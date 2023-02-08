package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Entity;
import com.example.demo.service.ServiceS;


@RestController
public class TestController {
	@Autowired
	ServiceS service;
	
	@PostMapping("/save")
	public void saveUser(@RequestBody Entity entity) {
		 service.save(entity);	
	}
	}
