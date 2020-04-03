package com.udemy.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.com.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>  {

}
