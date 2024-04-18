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
public class AdministradorController {
    @RequestMapping("/Administrador")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/Administrador/contenido";
    }
    
}
