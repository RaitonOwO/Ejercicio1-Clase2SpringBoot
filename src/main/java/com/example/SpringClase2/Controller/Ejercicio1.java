package com.example.SpringClase2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
@Controller
//Ejercicio de Bienvenida
public class Ejercicio1 {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("mensaje","Bienvenido al sistema!");
        String Fechahoy = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        model.addAttribute("Fechahoy", Fechahoy);
        return "index";
    }


}

