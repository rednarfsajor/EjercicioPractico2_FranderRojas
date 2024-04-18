/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.service.UsuarioDetailsService; 
import com.EjercicioPractico1.dao.UsuarioDao;
import com.EjercicioPractico1.domain.Usuario;
import com.EjercicioPractico1.domain.Rol;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service ("userDetailsService")
public class UsuarioDetailsServiceImpl implements UsuarioDetailsService, UserDetailsService { 
    
    @Autowired
    private UsuarioDao usuarioDao;
    @Autowired
    private HttpSession session;
    
    @Override
    @Transactional (readOnly= true)
    
    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException { //Busca el usuario por el username en la tabla
    Usuario usuario = usuarioDao.findByUsername (username);
    //Si no existe el usuario lanza una excepción
    if (usuario == null) {
        throw new UsernameNotFoundException ( username);
    }
    
    
    //Si está acá es porque existe el usuario... sacamos los roles que tiene
    var roles = new ArrayList<GrantedAuthority>();
    for (Rol rol: usuario.getRoles()) { //Se sacan los roles
        roles.add(new SimpleGrantedAuthority( rol.getNombre()));
    }
    
    //Se devuelve User (clase de userDetails)
    return new User (usuario.getUsername(),usuario.getPassword(),roles);
    }
}
