package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.Human;

@Repository
public interface HumanRepository extends JpaRepository<Human, Integer> {
    
}
