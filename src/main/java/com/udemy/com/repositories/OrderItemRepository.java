package com.udemy.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.com.entities.OrderItem;

import com.udemy.com.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>  {

}
