/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.dao.ReservaDao;
import com.EjercicioPractico1.domain.Reserva;
import com.EjercicioPractico1.service.ReservaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ReservaServiceImpl implements ReservaService{
    @Autowired
    private ReservaDao reservaDao;

    @Override
    @Transactional(readOnly=true)
    public List<Reserva> getReservas() {
        var lista=reservaDao.findAll();
        return lista;
    }
    
    @Override
    @Transactional(readOnly=true)
    public Reserva getReserva(Reserva reserva) {
        return reservaDao.findById(reserva.getId()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Reserva reserva) {
        reservaDao.save(reserva);
    }
    
     @Override
    @Transactional
    public void delete(Reserva reserva) {
        reservaDao.delete(reserva);
    }
    //FIltro de busqueda
    /*@Override
    @Transactional(readOnly=true)
    public List<Reserva> findByTituloContaining(String titulo){
        return reservaDao.findByTituloContaining(titulo);
    }*/
}
