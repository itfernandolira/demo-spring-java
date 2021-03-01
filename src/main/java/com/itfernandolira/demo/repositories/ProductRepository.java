package com.itfernandolira.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itfernandolira.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
