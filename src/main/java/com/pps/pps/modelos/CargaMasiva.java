package com.pps.pps.modelos;

import java.util.Date;

public class CargaMasiva {
    private String nombre;
    private String descripcion;
    private Date fecha;
    private int numero;
    private int cantidad;
    private String categoria;
    private double precio;
    private String ubicacion;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public CargaMasiva(String nombre, String descripcion, Date fecha, int numero, int cantidad, String categoria,
            double precio, String ubicacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.numero = numero;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }


    
}
