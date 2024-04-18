/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.service;
import com.EjercicioPractico1.domain.Hotel;
import java.util.List;
public interface HotelService {
    public List<Hotel> getHoteles();
    
    // Se obtiene un Categoria, a partir del id de un categoria
    public Hotel getHotel(Hotel hotel);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Hotel hotel);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Hotel hotel);
    
    //public List<Hotel> findByTituloContaining(String titulo);
}
