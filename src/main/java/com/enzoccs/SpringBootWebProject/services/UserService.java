package com.enzoccs.SpringBootWebProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enzoccs.SpringBootWebProject.entities.User;
import com.enzoccs.SpringBootWebProject.repositories.UserRepository;

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
		return u.get();
	}
	
	public User insertUser(User u) {
		return repository.save(u);
	}
	
	public void deleteUser(Integer id) {
		repository.deleteById(id);
	}
	
	public User updateUser(User u ,Integer id) {
		User userToUpdate = repository.getReferenceById(id);
		updateUser(userToUpdate,u);
		return repository.save(userToUpdate);
	}

	private void updateUser(User userToUpdate,User updatedUser) {
		userToUpdate.setEmail(updatedUser.getEmail());
		userToUpdate.setName(updatedUser.getName());
		userToUpdate.setPhone(updatedUser.getPhone());
	}

}
