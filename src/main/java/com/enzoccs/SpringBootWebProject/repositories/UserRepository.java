package com.enzoccs.SpringBootWebProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enzoccs.SpringBootWebProject.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
