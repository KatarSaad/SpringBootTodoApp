package com.example.demo.service;

import com.example.demo.dao.CategorieRepository;
import com.example.demo.entities.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceCategorie implements IServiceCategorie {
    @Autowired
    CategorieRepository categorieRepository;

    @Override
    public void ajoutCategorie(Categorie c) {
        categorieRepository.save(c);


    }

    @Override
    public void supprimeCategorie(int id) {
       categorieRepository.deleteById(id);
    }

    @Override
    public List<Categorie> gettAllCategorie() {
        return categorieRepository.findAll();
    }

    @Override
    public Categorie getCategorie(int id) {
        return categorieRepository.findById(id).get();
    }
}
