/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.controller;

import com.EjercicioPractico1.domain.Objeto2;
import com.EjercicioPractico1.service.Objeto2Service;
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
@RequestMapping("/objeto2")
public class Objeto2Controller {
    @Autowired
    private Objeto2Service objeto2Service;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var objetos1 = objeto2Service.getObjetos2();
        model.addAttribute("objetos1", objetos1);
        model.addAttribute("totalObjeto2s", objetos1.size());
        return "objeto2/listado";
    }
    
    @GetMapping("/nuevo")
    public String objeto2Nuevo(Objeto2 objeto2) {
        return "/objeto2/modifica";
    }
    @PostMapping("/guardar")
    public String objeto2Guardar(Objeto2 objeto2) {        
        
        objeto2Service.save(objeto2);
        return "redirect:/objeto2/listado";
    }
    
    
     @GetMapping("/eliminar/{id}")
    public String objeto2Eliminar(Objeto2 objeto2) {
        objeto2Service.delete(objeto2);
        return "redirect:/objeto2/listado";
    }

    @GetMapping("/modifica/{id}")
    public String categoriaModificar(Objeto2 objeto2, Model model) {
        objeto2 = objeto2Service.getObjeto2(objeto2);
        model.addAttribute("book", objeto2);
        return "/objeto2/modifica";
    } 
}
    //Filtros de busqueda
    /*@PostMapping("/query1")
    public String consultaPorTitulo(@RequestParam (value="titulo")String titulo, Model model){
        var objeto2s = objeto2Service.findByTituloContaining(titulo);
        model.addAttribute("objeto2s", objeto2s);
        model.addAttribute("titulo", titulo);
        return "objeto2/listado";
    }*/
