package com.in.minutes.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.minutes.microservices.limitsservice.bean.Limits;
import com.in.minutes.microservices.limitsservice.configuration.Configuration;

@RestController
public class LimitsConntroller {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrieveLimits()
	{
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}

}
