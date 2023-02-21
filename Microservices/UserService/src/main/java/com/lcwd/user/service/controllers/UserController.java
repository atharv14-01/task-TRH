package com.lcwd.user.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.user.service.entities.User;
import com.lcwd.user.service.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	// create
	@ResponseBody
	@PostMapping("/saveUser")
	public User createUser(@RequestBody User user) {

		System.out.println("user : " + user);
		User user1 = userService.saveUser(user);
		return user1;
	}

	// single user get

	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable int userId) {
		User user = userService.getUser(userId);
		return ResponseEntity.ok(user);
	}

	// all user get
	
	@GetMapping
	public List<User> getAllUser() {
		List<User> allUser = userService.getAllUser();
		return allUser;
	}
}
