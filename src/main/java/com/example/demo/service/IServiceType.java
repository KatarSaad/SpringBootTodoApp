package com.example.demo.service;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Type;

import java.util.List;

public interface IServiceType {
    public void ajoutType(Type t);
    public void supprimeerType(int id );
    public List<Type> gettAllType();
    public Type getType(int id);

}
