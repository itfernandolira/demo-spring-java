package com.itfernandolira.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itfernandolira.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
