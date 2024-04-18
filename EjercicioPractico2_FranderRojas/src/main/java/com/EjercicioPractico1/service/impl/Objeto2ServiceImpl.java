/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.dao.Objeto2Dao;
import com.EjercicioPractico1.domain.Objeto2;
import com.EjercicioPractico1.service.Objeto2Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class Objeto2ServiceImpl implements Objeto2Service{
    @Autowired
    private Objeto2Dao objeto2Dao;

    @Override
    @Transactional(readOnly=true)
    public List<Objeto2> getObjetos2() {
        var lista=objeto2Dao.findAll();
        return lista;
    }
    
    @Override
    @Transactional(readOnly=true)
    public Objeto2 getObjeto2(Objeto2 objeto2) {
        return objeto2Dao.findById(objeto2.getIdObjeto2()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Objeto2 objeto2) {
        objeto2Dao.save(objeto2);
    }
    
     @Override
    @Transactional
    public void delete(Objeto2 objeto2) {
        objeto2Dao.delete(objeto2);
    }
    //FIltro de busqueda
    /*@Override
    @Transactional(readOnly=true)
    public List<Objeto2> findByTituloContaining(String titulo){
        return objeto2Dao.findByTituloContaining(titulo);
    }*/
}
