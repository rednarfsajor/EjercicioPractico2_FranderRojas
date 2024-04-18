
package com.EjercicioPractico1.controller;

import com.EjercicioPractico1.domain.Hotel;
import com.EjercicioPractico1.service.HotelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var hoteles = hotelService.getHoteles();
        model.addAttribute("hoteles", hoteles);
        model.addAttribute("totalHoteles", hoteles.size());
        return "hotel/listado";
    }
    
    @GetMapping("/nuevo")
    public String hotelNuevo(Hotel hotel) {
        return "/hotel/modifica";
    }
    @PostMapping("/guardar")
    public String hotelGuardar(Hotel hotel) {        
        
        hotelService.save(hotel);
        return "redirect:/hotel/listado";
    }
    
    
     @GetMapping("/eliminar/{id}")
    public String hotelEliminar(Hotel hotel) {
        hotelService.delete(hotel);
        return "redirect:/hotel/listado";
    }

    @GetMapping("/modifica/{id}")
    public String categoriaModificar(Hotel hotel, Model model) {
        hotel = hotelService.getHotel(hotel);
        model.addAttribute("hotel", hotel);
        return "/hotel/modifica";
    }  
    
    /*@PostMapping("/query1")
    public String consultaPorTitulo(@RequestParam (value="titulo")String titulo, Model model){
        var hotels = hotelService.findByTituloContaining(titulo);
        model.addAttribute("hotels", hotels);
        model.addAttribute("titulo", titulo);
        return "hotel/listado";
    }*/
}
