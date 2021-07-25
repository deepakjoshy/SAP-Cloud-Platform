package com.example.demo1.repository;

import com.example.demo1.model.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * demorepository
 */
public interface demorepository extends JpaRepository<demo, Integer> {

    
}