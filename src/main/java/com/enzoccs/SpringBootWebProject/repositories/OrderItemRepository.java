package com.enzoccs.SpringBootWebProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enzoccs.SpringBootWebProject.entities.OrderItem;
import com.enzoccs.SpringBootWebProject.entities.pk.OrderItemPK;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
}
