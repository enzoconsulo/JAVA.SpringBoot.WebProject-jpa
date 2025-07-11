package com.enzoccs.SpringBootWebProject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enzoccs.SpringBootWebProject.entities.Category;
import com.enzoccs.SpringBootWebProject.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service; 
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> Categories = service.findAll();
		return ResponseEntity.ok().body(Categories);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Integer id){
		Category c = service.findById(id);
		return ResponseEntity.ok().body(c);
	}
	
}
