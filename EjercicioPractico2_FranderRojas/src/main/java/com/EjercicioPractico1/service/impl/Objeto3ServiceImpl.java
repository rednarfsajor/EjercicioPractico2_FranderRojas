/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.dao.Objeto3Dao;
import com.EjercicioPractico1.domain.Objeto3;
import com.EjercicioPractico1.service.Objeto3Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class Objeto3ServiceImpl implements Objeto3Service{
    @Autowired
    private Objeto3Dao objeto3Dao;

    @Override
    @Transactional(readOnly=true)
    public List<Objeto3> getObjetos3() {
        var lista=objeto3Dao.findAll();
        return lista;
    }
    
    @Override
    @Transactional(readOnly=true)
    public Objeto3 getObjeto3(Objeto3 objeto3) {
        return objeto3Dao.findById(objeto3.getIdObjeto3()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Objeto3 objeto3) {
        objeto3Dao.save(objeto3);
    }
    
     @Override
    @Transactional
    public void delete(Objeto3 objeto3) {
        objeto3Dao.delete(objeto3);
    }
    //FIltro de busqueda
    /*@Override
    @Transactional(readOnly=true)
    public List<Objeto3> findByTituloContaining(String titulo){
        return objeto3Dao.findByTituloContaining(titulo);
    }*/
}
