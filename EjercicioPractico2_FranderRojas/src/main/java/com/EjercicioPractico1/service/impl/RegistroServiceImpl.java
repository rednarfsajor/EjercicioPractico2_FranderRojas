
package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.domain.Usuario;
import com.EjercicioPractico1.service.RegistroService;
import com.EjercicioPractico1.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;


@Service
public class RegistroServiceImpl implements RegistroService {

    @Autowired
    private UsuarioService usuarioService;


    @Override
    public void crearUsuario(Model model, Usuario usuario) {
        var codigo = new BCryptPasswordEncoder();
        usuario.setPassword(codigo.encode(usuario.getPassword()));
        usuarioService.save(usuario, true);
    }
    
}
