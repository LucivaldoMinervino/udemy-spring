package com.udemy.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.com.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
