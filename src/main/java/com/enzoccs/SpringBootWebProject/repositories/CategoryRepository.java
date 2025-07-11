package com.enzoccs.SpringBootWebProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enzoccs.SpringBootWebProject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
}
