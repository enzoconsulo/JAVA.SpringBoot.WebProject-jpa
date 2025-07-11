package com.enzoccs.SpringBootWebProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enzoccs.SpringBootWebProject.entities.Category;
import com.enzoccs.SpringBootWebProject.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		List<Category> Categorys = repository.findAll(); 
		return Categorys;
	}
	
	public Category findById(Integer id) {
		Optional<Category> c = repository.findById(id);
		return c.get();
		
	}

}
