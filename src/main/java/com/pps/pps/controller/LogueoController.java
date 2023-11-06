package com.pps.pps.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pps.pps.Service.LoguinService;

public class LogueoController {
    private  LoguinService loguinService;
@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:8080" })
    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("user");
        String password = credentials.get("password");

        // Verifica las credenciales (aquí debes implementar tu lógica de autenticación)
        if (username.equals("admin") && password.equals("password")) {
            // Autenticación exitosa
            return ResponseEntity.ok("Inicio de sesión exitoso.");
        } else {
            // Autenticación fallida
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Autenticación fallida.");
        }
    }    
}
