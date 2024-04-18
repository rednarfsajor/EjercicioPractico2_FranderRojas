/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.dao.Objeto1Dao;
import com.EjercicioPractico1.domain.Objeto1;
import com.EjercicioPractico1.service.Objeto1Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class Objeto1ServiceImpl implements Objeto1Service{
    @Autowired
    private Objeto1Dao objeto1Dao;

    @Override
    @Transactional(readOnly=true)
    public List<Objeto1> getObjetos1() {
        var lista=objeto1Dao.findAll();
        return lista;
    }
    
    @Override
    @Transactional(readOnly=true)
    public Objeto1 getObjeto1(Objeto1 objeto1) {
        return objeto1Dao.findById(objeto1.getIdObjeto1()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Objeto1 objeto1) {
        objeto1Dao.save(objeto1);
    }
    
     @Override
    @Transactional
    public void delete(Objeto1 objeto1) {
        objeto1Dao.delete(objeto1);
    }
    //FIltro de busqueda
    /*@Override
    @Transactional(readOnly=true)
    public List<Objeto1> findByTituloContaining(String titulo){
        return objeto1Dao.findByTituloContaining(titulo);
    }*/
}
