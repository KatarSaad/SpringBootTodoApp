package com.example.demo.service;

import com.example.demo.entities.Produit;
import com.example.demo.entities.Todo;

import java.util.List;

public interface IserviceTodo{

    public void supprimerTodo(int id);
    public Todo rechercheParId(int id );
    public List<Todo> getAllProduits();
    public List<Todo> getProduitParText(String text);

    public Todo persisttodo(Todo p);
    public List<Todo> findTodoByType(int idc);
}
