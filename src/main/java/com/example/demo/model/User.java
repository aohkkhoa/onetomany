package com.example.demo.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity

@Table(name = "t_user")

public class User {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String firstName;

    private String lastName;

    private String mobile;

    @Column(unique = true)

    private String email;

    @ManyToOne(optional = false)
    @JoinColumn(name = "role_id")
   
    private Role role;


    public Long getId() {

        return id;

    }

    public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void setId(Long id) {

        this.id = id;

    }

    public String getFirstName() {

        return firstName;

    }
    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    public String getLastName() {

        return lastName;

    }

    public void setLastName(String lastName) {

        this.lastName = lastName;

    }
    public String getMobile() {

        return mobile;

    }

    public void setMobile(String mobile) {

        this.mobile = mobile;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }


   

}
