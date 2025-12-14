package com.example.hexspring.modulos;

import org.springframework.web.bind.annotation.*;
import com.example.hexspring.modulos.usuario;

@RestController
@RequestMapping("/usuarios")
public class    Registro {
    @PostMapping("/registro")
     public String registrarUsuario(@RequestBody usuario  usuario) {
        
        if (usuario.getNombre() == null || usuario.getNombre().isEmpty()) {
            return "El nombre es obligatorio";
        }

        if (usuario.getCorreo() == null || !usuario.getCorreo().contains("@")) {
            return "Correo electrónico inválido";
        }

        if (usuario.getContrasena() == null || usuario.getContrasena().length() < 6) {
            return "La contraseña debe tener al menos 6 caracteres";
        }

        // Aquí normalmente se guardaría en la base de datos
        return "Usuario registrado exitosamente";
    }
}
