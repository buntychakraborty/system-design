package com.lb_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LBServiceController {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/application")
	public String getData() {
		return "Getting response from "+port;
	}

}
