package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.RoleService;

@RestController
public class RoleController {
@Autowired RoleService rs;
@Autowired RoleRepository rr;
@DeleteMapping("/getallrole")
public List<Role> getall(){
	return rr.findAll();
}
}
