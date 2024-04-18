/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.service;

import com.EjercicioPractico1.domain.Objeto3;
import java.util.List;

    

public interface Objeto3Service {
    public List<Objeto3> getObjetos3();
    
    
    public Objeto3 getObjeto3(Objeto3 objeto3);
    
   
    public void save(Objeto3 objeto3);
    
    
    public void delete(Objeto3 objeto3);
    //Metodos de búsqueda
    //public List<Objeto3> findByTituloContaining(String titulo);
}