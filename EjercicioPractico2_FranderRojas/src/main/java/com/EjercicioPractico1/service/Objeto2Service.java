/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.service;

import com.EjercicioPractico1.domain.Objeto2;
import java.util.List;

    

public interface Objeto2Service {
    public List<Objeto2> getObjetos2();
    
    
    public Objeto2 getObjeto2(Objeto2 objeto2);
    
   
    public void save(Objeto2 objeto2);
    
    
    public void delete(Objeto2 objeto2);
    //Metodos de búsqueda
    //public List<Objeto2> findByTituloContaining(String titulo);
}
