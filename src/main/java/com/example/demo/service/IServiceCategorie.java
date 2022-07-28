package com.example.demo.service;

import com.example.demo.entities.Categorie;

import java.util.List;

public interface IServiceCategorie {
   public void ajoutCategorie(Categorie c);
   public void supprimeCategorie(int id );
   public List<Categorie> gettAllCategorie();
   public Categorie getCategorie(int id);

}
