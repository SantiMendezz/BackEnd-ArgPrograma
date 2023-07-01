/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.controller;

import com.example.porfolioAP.modelo.Trabajo;
import com.example.porfolioAP.repository.TrabajoRepo;
import com.example.porfolioAP.service.TrabajoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping({"/api/v1/"})
//@CrossOrigin(origins = "https://frontend-argprograma-santi.web.app")
@CrossOrigin(origins = "https://localhost:4200")
public class TrabajoController {
        
    @Autowired
    private TrabajoService jobServ;
    
    //Enlaza con el repositorio
    @Autowired
    public TrabajoRepo jobRepo;
    
    //Este metodo sirve para listar toda la educacion
    @GetMapping("/trabajo")
    public List<Trabajo> listarTodoTrabajo() {
        return jobServ.verTrabajo();
    }
    
    //Este metodo sirve para guardar el empleado
    //Recibe en su cuerpo un objeto educacion
    @PostMapping("/trabajo")
    public void guardarTrabajo (@RequestBody Trabajo educ) {
        jobServ.crearTrabajo(educ);
    }
    
    @PutMapping("/trabajo")
        public void modificarTrabajo(@RequestBody Trabajo job) {
        jobServ.editarTrabajo(job);
    }
        
    //Este metodo sirve para buscar una educacion por su id
    @GetMapping("/trabajo/{id}")
    public Trabajo buscarTrabajo (@PathVariable Long id) {
        return jobRepo.findById(id).orElse(null);
        //educServ.obtenerEducacionPorId(id);
        //Educacion educacion = repo.findById(id);
                //.orElseThrow(() -> new ResourceNotFoundException(("No se ha encontrado la educacion solicitada con la id:" + id)));
        //return ResponseEntity.ok(educacion);
    }
        
    @DeleteMapping ("/trabajo/{id}")    
    public void bajarTrabajo(@PathVariable Long id){
        jobServ.eliminarTrabajo(id);
    }
}
