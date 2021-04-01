package com.example.demo.repository;





import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Role;

import java.util.Optional;


@Repository

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);

}