/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.controller;
import com.EjercicioPractico1.domain.Empleado;
import com.EjercicioPractico1.service.EmpleadoService;
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
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var empleados = empleadoService.getEmpleados();
        model.addAttribute("empleados", empleados);
        model.addAttribute("totalEmpleados", empleados.size());
        return "empleado/listado";
    }
    
    @GetMapping("/nuevo")
    public String empleadoNuevo(Empleado empleado) {
        return "/empleado/modifica";
    }
    @PostMapping("/guardar")
    public String empleadoGuardar(Empleado empleado) {        
        
        empleadoService.save(empleado);
        return "redirect:/empleado/listado";
    }
    
    
     @GetMapping("/eliminar/{id}")
    public String empleadoEliminar(Empleado empleado) {
        empleadoService.delete(empleado);
        return "redirect:/empleado/listado";
    }

    @GetMapping("/modifica/{id}")
    public String categoriaModificar(Empleado empleado, Model model) {
        empleado = empleadoService.getEmpleado(empleado);
        model.addAttribute("book", empleado);
        return "/empleado/modifica";
    } 
}
    //Filtros de busqueda
    /*@PostMapping("/query1")
    public String consultaPorTitulo(@RequestParam (value="titulo")String titulo, Model model){
        var empleados = empleadoService.findByTituloContaining(titulo);
        model.addAttribute("empleados", empleados);
        model.addAttribute("titulo", titulo);
        return "empleado/listado";
    }*/
