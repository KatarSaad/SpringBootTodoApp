package com.example.demo.dao;

import com.example.demo.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Integer> {
 // List<Produit> findByidContains(String mc);
  @Query("select p from Produit p where p.nom like %:x%")
  List<Produit>rechercheParNom(@Param("x")String mc);
  @Query("select p from Produit p where p.categorie.id=:id")
  List<Produit> rechercheParCategorie(@Param("id") int id);


}
