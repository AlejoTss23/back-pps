package com.pps.pps.repositorios;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pps.pps.modelos.Cortes;

@Repository
public interface CortesRepository extends JpaRepository<Cortes, Long> {

    List<Cortes> findByFechaFaenaAndTipoCorte(Date fechaFaena, String tipoCorte);

    List<Cortes> findByProcedencia(String procedencia);
}
