package com.example.porfolioAP.service;

import com.example.porfolioAP.modelo.Educacion;
import com.example.porfolioAP.repository.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServiceImp implements EducacionService{

    //Enlaza con el repositorio
    @Autowired
    public EducacionRepo educRepo;
    
    @Override
    public List<Educacion> verEducacion() {
        //Busca todos con el metodo establecido en Hibernate
        return educRepo.findAll();
    }
    
    @Override
    public Educacion crearEducacion(Educacion educ) {
        return educRepo.save(educ);
    }
    
    @Override
    public void editarPersona(Educacion educ) {
        List<Educacion> listaEducacion = verEducacion();
        boolean flag = false;
        
        for(Educacion educacion : listaEducacion) {
            Long id = educacion.getId();
            if(educ.getId() == id) {
                educRepo.save(educ);
                flag = true;
            }
        }
        
        if(flag == false) {
            System.out.println("El id no corresponde a ningun dato en la BD");

        }
    }
    
    @Override
    public Educacion obtenerEducacionPorId(Long id) {
        return educRepo.findById(id).orElse(null);
        //Educacion educacion = repo.findById(id);
                //.orElseThrow(() -> new ResourceNotFoundException(("No se ha encontrado la educacion solicitada con la id:" + id)));
        //return ResponseEntity.ok(educacion);
    }
    
    @Override
    public void eliminarEducacion(Long id) {
        educRepo.deleteById(id);
    }
}
