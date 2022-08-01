package com.rockgustavo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rockgustavo.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
