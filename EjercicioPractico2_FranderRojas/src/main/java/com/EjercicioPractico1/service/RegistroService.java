/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.service;
import com.EjercicioPractico1.domain.Usuario;
import org.springframework.ui.Model;

public interface RegistroService {

    public void crearUsuario(Model model, Usuario usuario);
    
}
