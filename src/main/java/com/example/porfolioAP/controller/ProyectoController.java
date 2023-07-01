/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.controller;

import com.example.porfolioAP.modelo.Proyecto;
import com.example.porfolioAP.repository.ProyectoRepo;
import com.example.porfolioAP.service.ProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping({"/api/v1/"})
@CrossOrigin(origins = "https://frontend-argprograma-santi.web.app")
//@CrossOrigin(origins = "https://localhost:4200")
public class ProyectoController {
    @Autowired
    private ProyectoService projServ;
    
    //Enlaza con el repositorio
    @Autowired
    public ProyectoRepo projRepo;
    
    //Este metodo sirve para listar toda la educacion
    @GetMapping("/proyecto")
    public List<Proyecto> listarTodoProyecto() {
        return projServ.verProyecto();
    }
    
    //Este metodo sirve para guardar el empleado
    //Recibe en su cuerpo un objeto educacion
    @PostMapping("/proyecto")
    public void guardarProyecto (@RequestBody Proyecto proj) {
        projServ.crearProyecto(proj);
    }
    
    @PutMapping("/proyecto")
        public void modificarProyecto(@RequestBody Proyecto proj) {
        projServ.editarProyecto(proj);
    }
        
    //Este metodo sirve para buscar una educacion por su id
    @GetMapping("/proyecto/{id}")
    public Proyecto buscarProyecto(@PathVariable Long id) {
        return projRepo.findById(id).orElse(null);
        //educServ.obtenerEducacionPorId(id);
        //Educacion educacion = repo.findById(id);
                //.orElseThrow(() -> new ResourceNotFoundException(("No se ha encontrado la educacion solicitada con la id:" + id)));
        //return ResponseEntity.ok(educacion);
    }
        
    @DeleteMapping ("/proyecto/{id}")    
    public void bajarProyecto(@PathVariable Long id){
        projServ.eliminarProyecto(id);
    }
}
