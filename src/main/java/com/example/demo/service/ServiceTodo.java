package com.example.demo.service;

import com.example.demo.dao.ProduitRepository;
import com.example.demo.dao.TodoRepository;
import com.example.demo.entities.Produit;
import com.example.demo.entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceTodo implements IserviceTodo {
    @Autowired
    TodoRepository todoRepository;
    //overide your methods if needed

    public void ajoutTodo(Produit p) {
        todoRepository.save(p);

    }

    @Override
    public void supprimerTodo(int id) {
        todoRepository.deleteById(id);

    }

    @Override
    public Todo rechercheParId(int id) {

        return todoRepository.findById(id).get();
    }

    @Override
    public List<Todo> getAllProduits() {
        return todoRepository.findAll();
    }

    @Override
    public List<Todo> getProduitParNom(String nom) {
        return todoRepository.rechercheParNom(nom);
    }

    @Override
    public Todo persisttodo(Todo p) {
        return todoRepository.save(p);
    }


}
