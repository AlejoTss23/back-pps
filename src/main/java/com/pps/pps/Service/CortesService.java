package com.pps.pps.Service;

import org.springframework.stereotype.Service;

import com.pps.pps.modelos.Cortes;
import com.pps.pps.repositorios.CortesRepository;

@Service
public class CortesService {
     private final CortesRepository cortesRepository;

    
    public CortesService(CortesRepository cortesRepository) {
        this.cortesRepository = cortesRepository;
    }

    public Cortes guardarCaja(Cortes cortes) {
        return cortesRepository.save(cortes);
    }

    public Cortes guardarCortes(Cortes cortes) {
        return null;
    }
}
