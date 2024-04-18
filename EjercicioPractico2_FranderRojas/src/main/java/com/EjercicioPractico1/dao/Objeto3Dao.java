/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.dao;

import com.EjercicioPractico1.domain.Objeto3;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Objeto3Dao extends JpaRepository <Objeto3,Long>{
    
    //public List<Objeto3> findByTituloContaining(String titulo);
}
