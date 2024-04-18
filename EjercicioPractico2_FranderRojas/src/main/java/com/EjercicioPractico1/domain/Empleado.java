/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id; 
import jakarta.persistence.Table; 
import java.io.Serializable; 
import javax.validation.constraints.NotEmpty;
import lombok.Data; 
@Entity
@Data
@Table (name="empleados")
public class Empleado implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String cargo;
    private int hotel_id;
    
    public Empleado() {
    }
    
    public Empleado(String nombre, String cargo, int hotel_id) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.hotel_id = hotel_id;
    }
    
}
