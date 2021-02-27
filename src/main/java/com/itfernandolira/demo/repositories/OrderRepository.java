package com.itfernandolira.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itfernandolira.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
