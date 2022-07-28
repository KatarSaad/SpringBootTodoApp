package com.example.demo.service;

import com.example.demo.entities.Produit;

import java.util.List;

public interface IServiceProduit {
   // public void ajoutProduit(Produit p );
    public void supprimerProduit(int id);
    public Produit rechercheParId(int id );
    public List<Produit> getAllProduits();
    public List<Produit> getProduitParNom(String nom);
    //public void modifProduit(Produit p);
    public Produit persistroduit(Produit p);
    public List<Produit> findProduitsByCat(int idc);
}
