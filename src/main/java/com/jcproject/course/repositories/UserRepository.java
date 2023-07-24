package com.jcproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcproject.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
