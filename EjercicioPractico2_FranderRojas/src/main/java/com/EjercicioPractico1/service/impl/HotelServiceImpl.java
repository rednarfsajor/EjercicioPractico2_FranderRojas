/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.dao.HotelDao;
import com.EjercicioPractico1.domain.Hotel;
import com.EjercicioPractico1.service.HotelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    private HotelDao hotelDao;

    @Override
    @Transactional(readOnly=true)
    public List<Hotel> getHoteles() {
        var lista=hotelDao.findAll();
        return lista;
    }
    
    @Override
    @Transactional(readOnly=true)
    public Hotel getHotel(Hotel hotel) {
        return hotelDao.findById(hotel.getId()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Hotel hotel) {
        hotelDao.save(hotel);
    }
    
     @Override
    @Transactional
    public void delete(Hotel hotel) {
        hotelDao.delete(hotel);
    }
    
    /*@Override
    @Transactional(readOnly=true)
    public List<Hotel> findByNombreContaining(String nombre){
        return hotelDao.findByNombreContaining(nombre);
    }*/
}
