package com.udemy.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.com.entities.Category;
import com.udemy.com.entities.Order;


public interface CategoryRepository extends JpaRepository<Category, Long>  {

}
