package com.example.demo.model;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


@Entity

@Table(name = "t_role")

public class Role {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)

    private List<User> users;

    public Long getId() {

        return this.id;

    }

    public void setId(Long id) {

        this.id = id;

    }

    public String getName() {

        return this.name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getDescription() {

        return this.description;

   }

    public void setDescription(String description) {

        this.description = description;

    }

    public List<User> getUsers() {

        return users;

    }

    public void setUsers(List<User> users) {

        this.users = users;

    }

}
