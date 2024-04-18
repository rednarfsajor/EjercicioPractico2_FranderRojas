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
@Table (name="reservas")
public class Reserva implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String cliente_nombre;
    private String num_huespedes;
    private String fecha_ingreso;
    private String fecha_salida;
    private int hotel_id;
    
    public Reserva(){
    }
    public Reserva(String cliente_nombre, String num_huespedes, String fecha_ingreso, String fecha_salida, int hotel_id) {
        this.cliente_nombre = cliente_nombre;
        this.num_huespedes = num_huespedes;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.hotel_id = hotel_id;
    }
}
