/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

/**
 *
 * @author HP
 */
@Entity
@Table(name="proyecto")
public class Proyecto {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="nombre", length=120, nullable=false)
    private String nombre;
    
    @Column(name="fecha", length=11, nullable=false)
    private int fecha;
    
    @Column(name="descripcion", length=240, nullable=false)
    private String descripcion;
    
    @Column(name="tecnologia", length=120, nullable=false)
    private String tecnologia;
    
    @Column(name="link", length=240, nullable=false)
    private String link;
    
    @Size(max = 10 * 1024 * 1024)
    @Column(name = "primer_imagen",nullable = false)
    private byte[] primer_imagen;
    
    @Size(max = 10 * 1024 * 1024)
    @Column(name = "segundo_imagen",nullable = false)
    private byte[] segundo_imagen;
    
    @Size(max = 10 * 1024 * 1024)
    @Column(name = "tercer_imagen",nullable = false)
    private byte[] tercer_imagen;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, int fecha, String descripcion, String tecnologia, String link, byte[] primer_imagen, byte[] segundo_imagen, byte[] tercer_imagen) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tecnologia = tecnologia;
        this.link = link;
        this.primer_imagen = primer_imagen;
        this.segundo_imagen = segundo_imagen;
        this.tercer_imagen = tercer_imagen;
    }

    public byte[] getPrimer_imagen() {
        return primer_imagen;
    }

    public void setPrimer_imagen(byte[] primer_imagen) {
        this.primer_imagen = primer_imagen;
    }

    public byte[] getSegundo_imagen() {
        return segundo_imagen;
    }

    public void setSegundo_imagen(byte[] segundo_imagen) {
        this.segundo_imagen = segundo_imagen;
    }

    public byte[] getTercer_imagen() {
        return tercer_imagen;
    }

    public void setTercer_imagen(byte[] tercer_imagen) {
        this.tercer_imagen = tercer_imagen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
}
