
package com.EjercicioPractico1.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
@Data
@Entity
@Table(name="hoteles")
public class Hotel implements Serializable {
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    
    private Long id;
    
    private String nombre;
    
    private String ubicacion;
    
    private String descripcion;

    public Hotel() {
    }

    public Hotel(String nombre, String ubicacion, String descripcion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

   
}
