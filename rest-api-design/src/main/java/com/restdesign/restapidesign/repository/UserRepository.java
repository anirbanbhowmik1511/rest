package com.restdesign.restapidesign.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restdesign.restapidesign.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
