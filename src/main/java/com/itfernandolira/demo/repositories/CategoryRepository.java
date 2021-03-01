package com.itfernandolira.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itfernandolira.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
