package com.pitavya.breathe.controllers;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/breathe/api")
public class TestController {

	private static Logger LOGGER = Logger.getLogger(TestController.class);

	@RequestMapping(value = "/test")
	public String testApi() {
		LOGGER.info("testApi()");
		return "Test SuccessFull for Pitavya-Breathe Api";
	}

	@RequestMapping(value = "/")
	public String baseHit() {
		LOGGER.info("baseHit()");

		return "Up And Running Breathe Api";
	}

}
