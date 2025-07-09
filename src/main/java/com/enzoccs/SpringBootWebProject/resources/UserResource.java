package com.enzoccs.SpringBootWebProject.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enzoccs.SpringBootWebProject.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> showUsers(){
		User usertest = new User(1,"Enzo","Enzo@gmail.com","999999999","123"); 
		return ResponseEntity.ok().body(usertest);
	}
	
}
