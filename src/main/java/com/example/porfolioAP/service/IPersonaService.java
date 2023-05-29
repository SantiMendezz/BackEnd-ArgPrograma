/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.porfolioAP.service;

import com.example.porfolioAP.modelo.Persona;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IPersonaService {
    public List<Persona> verPersona ();
    public void editarPersona(Persona educ);
    public Persona crearPersona(Persona educ);
    public Persona obtenerPersonaPorId(Long id);
    public void eliminarPersona(Long id);
}
