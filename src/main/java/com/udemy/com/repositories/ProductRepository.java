package com.udemy.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.com.entities.Category;
import com.udemy.com.entities.Order;
import com.udemy.com.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>  {

}
