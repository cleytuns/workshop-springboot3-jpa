package com.jcproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcproject.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
