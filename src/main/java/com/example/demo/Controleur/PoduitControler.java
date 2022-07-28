package com.example.demo.Controleur;

import com.example.demo.dao.ProduitRepository;
import com.example.demo.entities.Produit;
import com.example.demo.service.IServiceCategorie;
import com.example.demo.service.IServiceProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/produit/")
public class PoduitControler {
    @Autowired
    IServiceCategorie iServiceCategorie;
    @Autowired
    IServiceProduit iServiceProduit;

    @GetMapping("all")
    public String all(Model m) {
        m.addAttribute("listeP", iServiceProduit.getAllProduits());
        return "affiche";
    }
    @DeleteMapping("delete/{id}")
    public String delete (@PathVariable int id ){
        iServiceProduit.supprimerProduit(id);
        return "redirect:/produit/all";

    }

    @GetMapping("add")
    public String add(Model m) {
        m.addAttribute("categories", iServiceCategorie.gettAllCategorie());
        return "ajout";

    }

    @PostMapping("add")
    public String ajout(Produit p) {
        iServiceProduit.persistroduit(p);
        return "redirect:/produit/all";

    }


    @GetMapping("update/{id}")
    public String update(Model m,@PathVariable int id ){
        m.addAttribute("categories",iServiceCategorie.gettAllCategorie());
        m.addAttribute("p",iServiceProduit.rechercheParId(id));
        return "modif";
    }
    @PostMapping("update")
    public String modif(Produit p){
        iServiceProduit.persistroduit(p);
        return "redirect:/produit/all";

    }


}
