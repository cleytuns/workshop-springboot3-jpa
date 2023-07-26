package com.jcproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcproject.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
