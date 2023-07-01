/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.modelo;

import jakarta.persistence.*;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "trabajo")
public class Trabajo {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="puesto", length = 60, nullable = false)
    private String puesto;
    
    @Column(name="periodo", length = 60, nullable = false)
    private String periodo;
    
    @Column(name="imagen", length = 60, nullable = false)
    private String imagen;
    
    @Column(name="descripcion", length = 120, nullable = false)
    private String descripcion;

    public Trabajo(long id, String puesto, String periodo, String imagen, String descripcion) {
        this.id = id;
        this.puesto = puesto;
        this.periodo = periodo;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }

    public Trabajo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
