package com.enzoccs.SpringBootWebProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.enzoccs.SpringBootWebProject.entities.User;
import com.enzoccs.SpringBootWebProject.repositories.UserRepository;
import com.enzoccs.SpringBootWebProject.services.exceptions.DatabaseException;
import com.enzoccs.SpringBootWebProject.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		List<User> users = repository.findAll(); 
		return users;
	}
	
	public User findById(Integer id) {
		Optional<User> u = repository.findById(id);
		return u.orElseThrow(()-> new ResourceNotFoundException(id));
	}
	
	public User insertUser(User u) {
		return repository.save(u);
	}
	
	public void deleteUser(Integer id) {
		try {
			
			if(!repository.existsById(id)) throw new ResourceNotFoundException(id);
			
			repository.deleteById(id);
		
		}catch(DataIntegrityViolationException e){
			throw new DatabaseException(e.getMessage());
		}catch(ResourceNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
		
	}
	
	public User updateUser(User u ,Integer id) {
		User userToUpdate = null;
		
		try {
			userToUpdate = repository.getReferenceById(id);
			updateUser(userToUpdate,u);

		}catch(EntityNotFoundException e){
			throw new ResourceNotFoundException(id);
		}
		
		
		return repository.save(userToUpdate);
	}

	private void updateUser(User userToUpdate,User updatedUser) {
		userToUpdate.setEmail(updatedUser.getEmail());
		userToUpdate.setName(updatedUser.getName());
		userToUpdate.setPhone(updatedUser.getPhone());
	}

}
