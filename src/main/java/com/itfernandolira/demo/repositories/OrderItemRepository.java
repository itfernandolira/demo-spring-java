package com.itfernandolira.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itfernandolira.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
