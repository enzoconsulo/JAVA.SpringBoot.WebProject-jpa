package com.enzoccs.SpringBootWebProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enzoccs.SpringBootWebProject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
}
