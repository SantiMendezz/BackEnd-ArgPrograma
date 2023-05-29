package com.example.porfolioAP.controller;

import com.example.porfolioAP.modelo.Educacion;
import com.example.porfolioAP.repository.EducacionRepo;
import com.example.porfolioAP.service.EducacionService;
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

//Direccion Url/puerto de Angular, es decir del FrontEnd

@RestController
@RequestMapping({"/api/v1/"})
@CrossOrigin(origins = "https://frontend-argprograma-santi.web.app")
public class EducacionController {
    
    @Autowired
    private EducacionService educServ;
    
    //Enlaza con el repositorio
    @Autowired
    public EducacionRepo educRepo;
    
    //Este metodo sirve para listar toda la educacion
    @GetMapping("/educacion")
    public List<Educacion> listarTodoEducacion() {
        return educServ.verEducacion();
    }
    
    //Este metodo sirve para guardar el empleado
    //Recibe en su cuerpo un objeto educacion
    @PostMapping("/educacion")
    public void guardarEducacion (@RequestBody Educacion educ) {
        educServ.crearEducacion(educ);
    }
    
    @PutMapping("/educacion")
        public void modificarEducacion(@RequestBody Educacion educ) {
        educServ.editarPersona(educ);
    }
        
    //Este metodo sirve para buscar una educacion por su id
    @GetMapping("/educacion/{id}")
    public Educacion buscarEducacion(@PathVariable Long id) {
        return educRepo.findById(id).orElse(null);
        //educServ.obtenerEducacionPorId(id);
        //Educacion educacion = repo.findById(id);
                //.orElseThrow(() -> new ResourceNotFoundException(("No se ha encontrado la educacion solicitada con la id:" + id)));
        //return ResponseEntity.ok(educacion);
    }
        
    @DeleteMapping ("/educacion/{id}")    
    public void bajarEducacion(@PathVariable Long id){
        educServ.eliminarEducacion(id);
    }
}
