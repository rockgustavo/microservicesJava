package com.rockgustavo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rockgustavo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
