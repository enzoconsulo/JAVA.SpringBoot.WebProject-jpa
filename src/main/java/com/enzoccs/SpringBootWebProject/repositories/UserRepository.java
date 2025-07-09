package com.enzoccs.SpringBootWebProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enzoccs.SpringBootWebProject.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
}
