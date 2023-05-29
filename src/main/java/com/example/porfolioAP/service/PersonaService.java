/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.service;

import com.example.porfolioAP.modelo.Persona;
import com.example.porfolioAP.repository.PersonaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class PersonaService implements IPersonaService{
    
    //Enlaza con el repositorio
    @Autowired
    public PersonaRepo persoRepo;
    
    @Override
    public List<Persona> verPersona () {
        //Busca todos con el metodo establecido en Hibernate
        return persoRepo.findAll();
    }
    
    @Override
    public Persona crearPersona(Persona perso) {
        return persoRepo.save(perso);
    }
    
    @Override
    public void editarPersona(Persona perso) {
        List<Persona> listaPersona = verPersona();
        boolean flag = false;
        
        for(Persona persona : listaPersona) {
            Long id = persona.getId();
            if(perso.getId() == id) {
                persoRepo.save(perso);
                flag = true;
            }
        }
        
        if(flag == false) {
            System.out.println("El id no corresponde a ningun dato en la BD");

        }
    }
    
    @Override
    public Persona obtenerPersonaPorId(Long id) {
        return persoRepo.findById(id).orElse(null);
        //Educacion educacion = repo.findById(id);
                //.orElseThrow(() -> new ResourceNotFoundException(("No se ha encontrado la educacion solicitada con la id:" + id)));
        //return ResponseEntity.ok(educacion);
    }
    
    @Override
    public void eliminarPersona(Long id) {
        persoRepo.deleteById(id);
    }
}
