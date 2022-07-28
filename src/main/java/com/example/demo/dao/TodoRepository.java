package com.example.demo.dao;

import com.example.demo.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo,Integer> {

    // List<Produit> findByidContains(String mc);
    @Query("select p from todo p where p.nom like %:x%")
    List<Todo> rechercheParNom(@Param("x")String mc);
    @Query("select p from todo p where p.type.id=:id")
    List<Todo> rechercheParType(@Param("id") int id);


}