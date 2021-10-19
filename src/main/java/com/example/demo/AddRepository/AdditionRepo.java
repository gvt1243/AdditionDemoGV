package com.example.demo.AddRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Addition;

public interface AdditionRepo extends JpaRepository<Addition, Integer> {

}
