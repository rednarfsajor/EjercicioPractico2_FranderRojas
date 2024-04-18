/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.dao;

import com.EjercicioPractico1.domain.Objeto2;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Objeto2Dao extends JpaRepository <Objeto2,Long>{
    
    //public List<Objeto2> findByTituloContaining(String titulo);
}
