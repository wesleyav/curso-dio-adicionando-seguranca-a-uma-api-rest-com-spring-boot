package com.github.wesleyav.diospringsecurityjwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.wesleyav.diospringsecurityjwt.model.User;
import com.github.wesleyav.diospringsecurityjwt.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping
	public void postUser(@RequestBody User user) {
		service.createUser(user);
	}
}
