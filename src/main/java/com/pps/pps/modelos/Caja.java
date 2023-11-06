package com.pps.pps.modelos;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Caja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroTropa;
    private Number codigoQR;
    private LocalDate fechaFaena;
    private LocalDate fechaVencimiento;
    private String procedencia;
    private String tipoCorte;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumeroTropa() {
        return numeroTropa;
    }
    public void setNumeroTropa(String numeroTropa) {
        this.numeroTropa = numeroTropa;
    }
    public Number getCodigoQR() {
        return codigoQR;
    }
    public void setCodigoQR(Number codigoQR) {
        this.codigoQR = codigoQR;
    }
    public LocalDate getFechaFaena() {
        return fechaFaena;
    }
    public void setFechaFaena(LocalDate fechaFaena) {
        this.fechaFaena = fechaFaena;
    }
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public String getProcedencia() {
        return procedencia;
    }
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    public String getTipoCorte() {
        return tipoCorte;
    }
    public void setTipoCorte(String tipoCorte) {
        this.tipoCorte = tipoCorte;
    }
    public Caja(Long id, String numeroTropa, Number codigoQR, LocalDate fechaFaena, LocalDate fechaVencimiento,
            String procedencia, String tipoCorte) {
        this.id = id;
        this.numeroTropa = numeroTropa;
        this.codigoQR = codigoQR;
        this.fechaFaena = fechaFaena;
        this.fechaVencimiento = fechaVencimiento;
        this.procedencia = procedencia;
        this.tipoCorte = tipoCorte;
    }
}
