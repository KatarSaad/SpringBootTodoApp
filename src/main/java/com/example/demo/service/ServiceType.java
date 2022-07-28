package com.example.demo.service;

import com.example.demo.dao.CategorieRepository;
import com.example.demo.dao.TypeRepository;
import com.example.demo.entities.Categorie;
import com.example.demo.entities.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceType implements IServiceType {
    @Autowired
    TypeRepository typeRepository;

    //@Override
  //  public void ajoutType(Type t) {
     //   typeRepository.save(t);


    //}

    @Override
    public void ajoutType(Type t) {
       // typeRepository.save(t);

    }

    @Override
    public void supprimeerType(int id) {
        typeRepository.deleteById(id);
    }

    @Override
    public List<Type> gettAllType() {
        return typeRepository.findAll();
    }

    @Override
    public Type getType(int id) {
        return typeRepository.findById(id).get();
    }
}
