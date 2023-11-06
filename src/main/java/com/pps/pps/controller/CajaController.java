package com.pps.pps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pps.pps.Service.CajaService;
import com.pps.pps.modelos.Caja;
@RestController
@RequestMapping("/caja")

public class CajaController {
  private final CajaService cajaService;

    @Autowired
    public CajaController(CajaService cajaService) {
        this.cajaService = cajaService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<Caja> guardarEnCaja(@RequestBody Caja caja) {
        Caja cajaGuardada = cajaService.guardarCaja(caja);
        return ResponseEntity.ok(cajaGuardada);
    }   
}
