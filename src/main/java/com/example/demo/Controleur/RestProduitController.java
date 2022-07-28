package com.example.demo.Controleur;


import com.example.demo.entities.Produit;
import com.example.demo.service.IServiceProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produits")
public class RestProduitController {

    @Autowired
    IServiceProduit iServiceProduit;


    @GetMapping("")
    public List<Produit> all(){
        return iServiceProduit.getAllProduits();
    }

    @GetMapping("/{id}")
    public Produit getProduit(@PathVariable int id ){
        return iServiceProduit.rechercheParId(id);

    }

    @PostMapping("/add")
    public Produit add(@RequestBody Produit p){
        return iServiceProduit.persistroduit(p);
    }
    @DeleteMapping("/{id}")
    public String delete (@PathVariable int id ){
        iServiceProduit.supprimerProduit(id);
        return "Suppression reussite";

    }
    @PutMapping("/update")
    public Produit update(@RequestBody Produit p){
        return iServiceProduit.persistroduit(p);
    }
    @PostMapping("/findbycat")
    public List<Produit> add(@RequestParam int idc){
        return iServiceProduit.findProduitsByCat(idc);
    }
}
