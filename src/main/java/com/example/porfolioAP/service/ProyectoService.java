/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.service;

import com.example.porfolioAP.modelo.Proyecto;
import com.example.porfolioAP.repository.ProyectoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    public ProyectoRepo proyectoRepo; 
    
    @Override
    public List<Proyecto> verProyecto () {
        return proyectoRepo.findAll();
    }
    
    @Override
    public void editarProyecto(Proyecto project) {
        List<Proyecto> listaProyecto = verProyecto();
        boolean flag = false;
        
        for(Proyecto pro : listaProyecto) {
            Long id = pro.getId();
            if(project.getId() == id) {
                proyectoRepo.save(project);
                flag = true;
            }
        }
        
        if(flag == false) {
            System.out.println("El id no corresponde a ningun dato en la BD");

        }
    }
    
    @Override
    public Proyecto crearProyecto(Proyecto skill) {
        //skill.setTipo_skill(tipo_skill);
        return proyectoRepo.save(skill);
    }
    
    @Override
    public Proyecto obtenerProyectoPorId(Long id) {
        return proyectoRepo.findById(id).orElse(null);
    }
    
    @Override
    public void eliminarProyecto(Long id) {
        proyectoRepo.deleteById(id);
    }
}
