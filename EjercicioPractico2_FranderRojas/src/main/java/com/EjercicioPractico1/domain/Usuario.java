/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    
    private Long idUsuario;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellidos;

    @OneToMany
    
    @JoinColumn (name="id_usuario")
    private List<Rol> roles;
    
    public Usuario() {
    }

    public Usuario(String username, String password, String nombre, String apellidos) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    
    
}
