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
@Table(name = "skill")
public class Skill {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre",length=50,nullable=false)
    private String nombre;
    
    @Column(name = "porcentaje",length=11,nullable=false)
    private int porcentaje;
    
    @JoinColumn(name="tipo_skill")
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private Tipo_Skill tipo_skill;

    public Skill() {
        
    }

    public Skill(Long id, String nombre, int porcentaje, Tipo_Skill tipo_skill) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.tipo_skill = tipo_skill;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
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

    public Tipo_Skill getTipo_skill() {
        return tipo_skill;
    }

    public void setTipo_skill(Tipo_Skill tipo_skill) {
        this.tipo_skill = tipo_skill;
    }
    
    
}
