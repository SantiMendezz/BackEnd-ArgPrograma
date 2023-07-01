/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.service;

import com.example.porfolioAP.modelo.Trabajo;
import com.example.porfolioAP.repository.TrabajoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class TrabajoService implements ITrabajoService{
    
    //Enlace con el repo
    @Autowired
    public TrabajoRepo trabRep;

    @Override
    public List<Trabajo> verTrabajo() {
        return trabRep.findAll();
    }

    @Override
    public void editarTrabajo(Trabajo job) {
        List<Trabajo> listaTrabajo = verTrabajo();
        boolean flag = false;
        
        for(Trabajo educacion : listaTrabajo) {
            Long id = educacion.getId();
            if(job.getId() == id) {
                trabRep.save(job);
                flag = true;
            }
        }
        
        if(flag == false) {
            System.out.println("El id no corresponde a ningun dato en la BD");

        }
    }

    @Override
    public Trabajo crearTrabajo(Trabajo job) {
        return trabRep.save(job);
    }

    @Override
    public Trabajo obtenerTrabajoPorId(Long id) {
        return trabRep.findById(id).orElse(null);
    }

    @Override
    public void eliminarTrabajo(Long id) {
        trabRep.deleteById(id);
    }

}
