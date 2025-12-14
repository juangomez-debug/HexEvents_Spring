package com.example.hexspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerhola {
    @GetMapping("/")
    public String hola() {
        return "Hola, querido usuario este es solo un prototipo de Hex muchas gracias por ver!";
    }                   
}
