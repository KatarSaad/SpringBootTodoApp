package com.example.demo.dao;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type,Integer> {



}
