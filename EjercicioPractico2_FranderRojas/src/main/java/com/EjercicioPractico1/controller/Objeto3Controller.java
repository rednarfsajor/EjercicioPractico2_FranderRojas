/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.controller;

import com.EjercicioPractico1.domain.Objeto3;
import com.EjercicioPractico1.service.Objeto3Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
@RequestMapping("/objeto3")
public class Objeto3Controller {
    @Autowired
    private Objeto3Service objeto3Service;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var objetos1 = objeto3Service.getObjetos3();
        model.addAttribute("objetos1", objetos1);
        model.addAttribute("totalObjeto3s", objetos1.size());
        return "objeto3/listado";
    }
    
    @GetMapping("/nuevo")
    public String objeto3Nuevo(Objeto3 objeto3) {
        return "/objeto3/modifica";
    }
    @PostMapping("/guardar")
    public String objeto3Guardar(Objeto3 objeto3) {        
        
        objeto3Service.save(objeto3);
        return "redirect:/objeto3/listado";
    }
    
    
     @GetMapping("/eliminar/{id}")
    public String objeto3Eliminar(Objeto3 objeto3) {
        objeto3Service.delete(objeto3);
        return "redirect:/objeto3/listado";
    }

    @GetMapping("/modifica/{id}")
    public String categoriaModificar(Objeto3 objeto3, Model model) {
        objeto3 = objeto3Service.getObjeto3(objeto3);
        model.addAttribute("book", objeto3);
        return "/objeto3/modifica";
    } 
}
    //Filtros de busqueda
    /*@PostMapping("/query1")
    public String consultaPorTitulo(@RequestParam (value="titulo")String titulo, Model model){
        var objeto3s = objeto3Service.findByTituloContaining(titulo);
        model.addAttribute("objeto3s", objeto3s);
        model.addAttribute("titulo", titulo);
        return "objeto3/listado";
    }*/
