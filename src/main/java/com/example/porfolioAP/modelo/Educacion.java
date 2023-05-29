package com.example.porfolioAP.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "educacion")
public class Educacion {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="institucion", length = 11, nullable = false)
    private String institucion;
    
    @Column(name="duracion", length = 11, nullable = false)
    private int duracion;
    
    @Column(name="finalizado", length = 60, nullable = false)
    private int finalizado;
    
    @Column(name="nombre", length = 60, nullable = false)
    private String nombre;
    
    @Column(name="imagen", length = 60, nullable = false)
    private String imagen;

    public Educacion() {
    }

    public Educacion(Long id, String institucion, int duracion, int finalizado, String nombre, String imagen) {
        this.id = id;
        this.institucion = institucion;
        this.duracion = duracion;
        this.finalizado = finalizado;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(int finalizado) {
        this.finalizado = finalizado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    
}
