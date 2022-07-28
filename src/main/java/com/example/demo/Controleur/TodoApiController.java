package com.example.demo.Controleur;

import com.example.demo.entities.Produit;
import com.example.demo.entities.Todo;
import com.example.demo.service.IServiceProduit;
import com.example.demo.service.IserviceTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produits")
public class TodoApiController {

    @Autowired
    IserviceTodo iserviceTodo;


    @GetMapping("")
    public List<Todo> all(){
        return iserviceTodo.getAllProduits();
    }

    @GetMapping("/{id}")
    public Todo getProduit(@PathVariable int id ){
        return iserviceTodo.rechercheParId(id);

    }

    @PostMapping("/add")
    public Todo add(@RequestBody Todo p){
        return iserviceTodo.persisttodo(p);
    }
    @DeleteMapping("/{id}")
    public String delete (@PathVariable int id ){
        iserviceTodo.supprimerTodo(id);
        return "Suppression reussite";

    }
    @PutMapping("/update")
    public Todo update(@RequestBody Todo p){
        return iserviceTodo.persisttodo(p);
    }
    @PostMapping("/findbytype")
    public List<Todo> add(@RequestParam int idc){
        return iserviceTodo.findTodoByType(idc);
    }
}
