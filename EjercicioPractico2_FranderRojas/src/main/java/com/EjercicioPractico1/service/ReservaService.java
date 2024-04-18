/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.service;

import com.EjercicioPractico1.domain.Reserva;
import java.util.List;

    

public interface ReservaService {
    public List<Reserva> getReservas();
    
    
    public Reserva getReserva(Reserva reserva);
    
   
    public void save(Reserva reserva);
    
    
    public void delete(Reserva reserva);
    //Metodos de búsqueda
    //public List<Reserva> findByTituloContaining(String titulo);
}
