package com.EjercicioPractico1.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import com.EjercicioPractico1.domain.Empleado;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoDao extends JpaRepository <Empleado,Long>{
    
}
