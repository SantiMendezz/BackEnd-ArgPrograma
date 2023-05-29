/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.controller;

import com.example.porfolioAP.modelo.Persona;
import com.example.porfolioAP.repository.PersonaRepo;
import com.example.porfolioAP.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping({"/api/v1/"})
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired
    private PersonaService persoServ;
    
    //Enlaza con el repositorio
    @Autowired
    public PersonaRepo persoRepo;
    
    //Este metodo sirve para listar toda la educacion
    @GetMapping("/persona")
    public List<Persona> listarTodoPersona() {
        return persoServ.verPersona();
    }
    
    //Este metodo sirve para guardar el empleado
    //Recibe en su cuerpo un objeto educacion
    @PostMapping("/persona")
    public void guardarPersona (@RequestBody Persona perso) {
        persoServ.crearPersona(perso);
    }
    
    @PutMapping("/persona")
        public void modificarPersona(@RequestBody Persona perso) {
        persoServ.editarPersona(perso);
    }
        
    //Este metodo sirve para buscar una educacion por su id
    @GetMapping("/persona/{id}")
    public Persona buscarPersona(@PathVariable Long id) {
        return persoRepo.findById(id).orElse(null);
        //educServ.obtenerEducacionPorId(id);
        //Educacion educacion = repo.findById(id);
                //.orElseThrow(() -> new ResourceNotFoundException(("No se ha encontrado la educacion solicitada con la id:" + id)));
        //return ResponseEntity.ok(educacion);
    }
        
    @DeleteMapping ("/persona/{id}")    
    public void bajarPersona(@PathVariable Long id){
        persoServ.eliminarPersona(id);
    }
}
