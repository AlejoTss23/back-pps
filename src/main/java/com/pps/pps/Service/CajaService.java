package com.pps.pps.Service;


import org.springframework.stereotype.Service;

import com.pps.pps.modelos.Caja;
import com.pps.pps.repositorios.CajaRepository;
@Service
public class CajaService {
    private CajaRepository cajaRepository;
     
    public CajaService(CajaRepository cajaRepository) {
        this.cajaRepository = cajaRepository;
    }
    
    public Caja guardarCaja(Caja caja) {
        return null;
    }
}
