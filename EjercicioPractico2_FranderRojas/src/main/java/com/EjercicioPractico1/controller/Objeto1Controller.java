/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.controller;
import com.EjercicioPractico1.domain.Objeto1;
import com.EjercicioPractico1.service.Objeto1Service;
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
@RequestMapping("/objeto1")
public class Objeto1Controller {
    @Autowired
    private Objeto1Service objeto1Service;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var objetos1 = objeto1Service.getObjetos1();
        model.addAttribute("objetos1", objetos1);
        model.addAttribute("totalObjeto1s", objetos1.size());
        return "objeto1/listado";
    }
    
    @GetMapping("/nuevo")
    public String objeto1Nuevo(Objeto1 objeto1) {
        return "/objeto1/modifica";
    }
    @PostMapping("/guardar")
    public String objeto1Guardar(Objeto1 objeto1) {        
        
        objeto1Service.save(objeto1);
        return "redirect:/objeto1/listado";
    }
    
    
     @GetMapping("/eliminar/{id}")
    public String objeto1Eliminar(Objeto1 objeto1) {
        objeto1Service.delete(objeto1);
        return "redirect:/objeto1/listado";
    }

    @GetMapping("/modifica/{id}")
    public String categoriaModificar(Objeto1 objeto1, Model model) {
        objeto1 = objeto1Service.getObjeto1(objeto1);
        model.addAttribute("book", objeto1);
        return "/objeto1/modifica";
    } 
}
    //Filtros de busqueda
    /*@PostMapping("/query1")
    public String consultaPorTitulo(@RequestParam (value="titulo")String titulo, Model model){
        var objeto1s = objeto1Service.findByTituloContaining(titulo);
        model.addAttribute("objeto1s", objeto1s);
        model.addAttribute("titulo", titulo);
        return "objeto1/listado";
    }*/
