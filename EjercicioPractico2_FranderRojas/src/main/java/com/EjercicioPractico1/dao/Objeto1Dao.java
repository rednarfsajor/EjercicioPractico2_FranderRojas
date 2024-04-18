package com.EjercicioPractico1.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import com.EjercicioPractico1.domain.Objeto1;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Objeto1Dao extends JpaRepository <Objeto1,Long>{
    //Filtros de busqueda
    //public List<Objeto1> findByTituloContaining(String titulo);
}
