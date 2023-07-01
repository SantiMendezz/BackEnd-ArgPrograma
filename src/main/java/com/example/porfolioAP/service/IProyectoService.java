/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.porfolioAP.service;

import com.example.porfolioAP.modelo.Proyecto;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IProyectoService {
    public List<Proyecto> verProyecto ();
    public void editarProyecto(Proyecto educ);
    public Proyecto crearProyecto(Proyecto educ);
    public Proyecto obtenerProyectoPorId(Long id);
    public void eliminarProyecto(Long id);
}
