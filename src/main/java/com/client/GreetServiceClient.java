package com.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="GREET-SERVICE")
public interface GreetServiceClient {

	@GetMapping("/greet")
	public String invokeGreetService();
}
