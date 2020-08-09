package com.pitavya.breathe.controllers;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pitavya.breathe.model.UserEntity;
import com.pitavya.breathe.requestModels.SaveUserRequestModel;
import com.pitavya.breathe.service.UserService;

@RestController
@RequestMapping("/breathe/api")
public class LoginController {

	private static Logger LOGGER = Logger.getLogger(LoginController.class);

	@Autowired
	private UserService userService;

	@PostMapping(value = "/signin")
	public UserEntity saveUser(@RequestBody SaveUserRequestModel requestModel) {
		LOGGER.info("saveUser()");
		return userService.saveUserService(requestModel);
	}

	@GetMapping(value = "/getUserByUserId")
	public UserEntity getUserByUserId(@RequestParam("userId") long userId) {
		LOGGER.info("getUserByUserId()");
		return userService.getUserByUserId(userId);
	}

	@GetMapping(value = "/getUserByEmail")
	public UserEntity getUserByEmail(@RequestParam("email") String email) {
		LOGGER.info("getUserByEmail()");
		return userService.getUserByEmail(email);
	}

	@GetMapping(value = "/getUserByProvidedId")
	public UserEntity getUserByProvidedId(@RequestParam("providedId") String providedId) {
		LOGGER.info("getUserByProvidedId()");
		return userService.getUserByProvidedId(providedId);
	}

}
