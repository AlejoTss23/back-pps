package com.pps.pps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import com.pps.pps.Service.CortesService;
import com.pps.pps.modelos.Cortes;

@RestController
@RequestMapping("/cortes")
public class CortesController {
    private final CortesService cortesService;

    @Autowired
    public CortesController(CortesService cortesService) {
        this.cortesService = cortesService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<Cortes> guardarEnCortes(@RequestBody Cortes cortes) {
        Cortes cortesGuardado = cortesService.guardarCortes(cortes);
        return ResponseEntity.ok(cortesGuardado);
    }
}
