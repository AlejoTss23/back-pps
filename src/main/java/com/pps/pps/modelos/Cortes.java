package com.pps.pps.modelos;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cortes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int cajaid;
    private String numeroTropa;
    public int getCajaid() {
        return cajaid;
    }
    public void setCajaid(int cajaid) {
        this.cajaid = cajaid;
    }
    public Cortes(Long id, int cajaid, String numeroTropa, LocalDate fechaFaena, LocalDate fechaVencimiento,
            String procedencia, String tipoCorte, Double pesoNeto, String codigoQR) {
        this.id = id;
        this.cajaid = cajaid;
        this.numeroTropa = numeroTropa;
        this.fechaFaena = fechaFaena;
        this.fechaVencimiento = fechaVencimiento;
        this.procedencia = procedencia;
        this.tipoCorte = tipoCorte;
        this.pesoNeto = pesoNeto;
        this.codigoQR = codigoQR;
    }
    private LocalDate fechaFaena;
    private LocalDate fechaVencimiento;
    private String procedencia;
    private String tipoCorte;
    private Double pesoNeto;
    private String codigoQR; // Agregar el campo de código QR
  
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
    public Double getPesoNeto() {
        return pesoNeto;
    }
    public void setPesoNeto(Double pesoNeto) {
        this.pesoNeto = pesoNeto;
    }
    public String getCodigoQR() {
        return codigoQR;
    }
    public void setCodigoQR(String codigoQR) {
        this.codigoQR = codigoQR;
    }
    public Cortes(Long id, String numeroTropa, LocalDate fechaFaena, LocalDate fechaVencimiento, String procedencia,
            String tipoCorte, Double pesoNeto, String codigoQR) {
        this.id = id;
        this.numeroTropa = numeroTropa;
        this.fechaFaena = fechaFaena;
        this.fechaVencimiento = fechaVencimiento;
        this.procedencia = procedencia;
        this.tipoCorte = tipoCorte;
        this.pesoNeto = pesoNeto;
        this.codigoQR = codigoQR;
    }
    
    
}
