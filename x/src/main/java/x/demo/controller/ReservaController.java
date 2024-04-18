/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package x.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author roger
 */
@Controller
public class ReservaController {
    
    @RequestMapping("/Reserva")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/Reserva/contenido"; // Quitamos el "/" al inicio para que coincida con la ruta relativa
    }
}
