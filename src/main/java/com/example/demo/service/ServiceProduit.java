package com.example.demo.service;

import com.example.demo.dao.ProduitRepository;
import com.example.demo.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceProduit implements IServiceProduit {
    @Autowired
    ProduitRepository produitRepository;
    //overide your methods if needed

    public void ajoutProduit(Produit p) {
        produitRepository.save(p);

    }

    @Override
    public void supprimerProduit(int id) {
        produitRepository.deleteById(id);

    }

    @Override
    public Produit rechercheParId(int id) {

        return produitRepository.findById(id).get();
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public List<Produit> getProduitParNom(String nom) {
        return produitRepository.rechercheParNom(nom);
    }

    @Override
    public Produit persistroduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public List<Produit> findProduitsByCat(int idc) {
        return produitRepository.rechercheParCategorie( idc);
    }


    public void modifProduit(Produit p) {
        produitRepository.save(p);

    }
}
