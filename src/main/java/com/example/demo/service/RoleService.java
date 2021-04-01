package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;

@Service
public class RoleService {

	@Autowired RoleRepository rr;
	
	@Autowired UserRepository ur;
	
	public Role addrole(Role role) {
		return rr.save(role);
	}
}
