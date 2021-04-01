package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
public class UserController {

	
	@Autowired UserRepository ur;
	
	@GetMapping("/alluser")
	public List<User> getalluser(){
		return ur.findAll();
	}
}
