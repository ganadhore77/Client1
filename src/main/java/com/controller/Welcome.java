package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.client.GreetServiceClient;

@RestController
public class Welcome {
	
	@Autowired
	private GreetServiceClient greetClient;
	
	@Autowired
	private Environment env;

	@GetMapping("/welcome")
	public String get() {
		String port = env.getProperty("server.port");
		
		String invokeGreetService = greetClient.invokeGreetService();
		
		return "Welcmoe to Service-1 ( WELCOME ) :: and port number ================="+port +" --- "+invokeGreetService;
	}
	
}
