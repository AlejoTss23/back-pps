package com.pps.pps.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pps.pps.modelos.Loguin;

@Repository
public interface LoguinRepository extends JpaRepository<Loguin, Long >{
    public Optional<Loguin> findById(String user);
    public Optional<Loguin> findByTitulo(String password);
}

