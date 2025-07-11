package com.enzoccs.SpringBootWebProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enzoccs.SpringBootWebProject.entities.Order;
import com.enzoccs.SpringBootWebProject.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		List<Order> orders = repository.findAll();
		return orders;
	}

	public Order findById(Integer id) {
		Optional<Order> o = repository.findById(id);
		return o.get();

	}

}
