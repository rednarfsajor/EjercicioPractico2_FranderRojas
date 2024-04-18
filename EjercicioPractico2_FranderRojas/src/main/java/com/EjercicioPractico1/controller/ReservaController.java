/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.controller;

import com.EjercicioPractico1.domain.Reserva;
import com.EjercicioPractico1.service.ReservaService;
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
@RequestMapping("/reserva")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var reservas = reservaService.getReservas();
        model.addAttribute("reservas", reservas);
        model.addAttribute("totalReservas", reservas.size());
        return "reserva/listado";
    }
    
    @GetMapping("/nuevo")
    public String reservaNuevo(Reserva reserva) {
        return "/reserva/modifica";
    }
    @PostMapping("/guardar")
    public String reservaGuardar(Reserva reserva) {        
        
        reservaService.save(reserva);
        return "redirect:/reserva/listado";
    }
    
    
     @GetMapping("/eliminar/{id}")
    public String reservaEliminar(Reserva reserva) {
        reservaService.delete(reserva);
        return "redirect:/reserva/listado";
    }

    @GetMapping("/modifica/{id}")
    public String categoriaModificar(Reserva reserva, Model model) {
        reserva = reservaService.getReserva(reserva);
        model.addAttribute("reserva", reserva);
        return "/reserva/modifica";
    } 
}
    //Filtros de busqueda
    /*@PostMapping("/query1")
    public String consultaPorTitulo(@RequestParam (value="titulo")String titulo, Model model){
        var reservas = reservaService.findByTituloContaining(titulo);
        model.addAttribute("reservas", reservas);
        model.addAttribute("titulo", titulo);
        return "reserva/listado";
    }*/
