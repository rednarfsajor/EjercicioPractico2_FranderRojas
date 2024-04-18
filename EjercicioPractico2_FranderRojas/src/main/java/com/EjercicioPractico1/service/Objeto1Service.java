/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.service;

import com.EjercicioPractico1.domain.Objeto1;
import java.util.List;

    

public interface Objeto1Service {
    public List<Objeto1> getObjetos1();
    
    
    public Objeto1 getObjeto1(Objeto1 objeto1);
    
   
    public void save(Objeto1 objeto1);
    
    
    public void delete(Objeto1 objeto1);
    //Metodos de búsqueda
    //public List<Objeto1> findByTituloContaining(String titulo);
}
