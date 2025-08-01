package com.enzoccs.SpringBootWebProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enzoccs.SpringBootWebProject.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
}
