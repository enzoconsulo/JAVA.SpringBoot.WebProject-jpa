package com.enzoccs.SpringBootWebProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enzoccs.SpringBootWebProject.entities.Product;
import com.enzoccs.SpringBootWebProject.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		List<Product> Products = repository.findAll(); 
		return Products;
	}
	
	public Product findById(Integer id) {
		Optional<Product> p = repository.findById(id);
		return p.get();
		
	}

}
