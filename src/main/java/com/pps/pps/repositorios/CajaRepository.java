package com.pps.pps.repositorios;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pps.pps.modelos.Caja;

public interface CajaRepository extends JpaRepository<Caja, Long> {
    List<Caja> findByFechaFaenaAndTipoCorte(Date fechaFaena, String tipoCorte);

    List<Caja> findByProcedencia(String procedencia);


}