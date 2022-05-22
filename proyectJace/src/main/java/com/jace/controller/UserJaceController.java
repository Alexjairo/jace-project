package com.jace.controller;

import com.jace.entity.User;
import com.jace.service.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/apiJace") // raiz

public class UserJaceController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> findAll() {
		return userService.findAll();
	}

	@GetMapping("/usersPrueba")
	public List<User> findAllP() {
		return this.userService.findAll();
	}

	@GetMapping("/users/{userId}")
	public Optional<User> getUser(@PathVariable String userDni) {
		Optional<User> user = this.userService.findById(userDni);
		if (user == null) {
			throw new RuntimeException("User not found-" + userDni);
		}
		return user;
	}

	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		user.setDni("0");
		userService.save(user);
		return user;
	}

	@DeleteMapping("/user/{userId}")
	public String deleteUser(@PathVariable String userDni) {
		Optional<User> user = userService.findById(userDni);
		if (user == null) {
			throw new RuntimeException("User not Found" + userDni);
		}
		userService.deleteById("userDni");

		return "Delete User: " + userDni;

	}
}
