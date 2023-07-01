/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.porfolioAP.service;

import com.example.porfolioAP.modelo.Trabajo;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ITrabajoService {
    public List<Trabajo> verTrabajo ();
    public void editarTrabajo(Trabajo job);
    public Trabajo crearTrabajo(Trabajo job);
    public Trabajo obtenerTrabajoPorId(Long id);
    public void eliminarTrabajo(Long id);
}
