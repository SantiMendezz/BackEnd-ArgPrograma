/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.controller;

import com.example.porfolioAP.modelo.Soft_Skill;
import com.example.porfolioAP.repository.SoftSkillRepo;
import com.example.porfolioAP.service.SoftSkillService;
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
public class SoftSkillController {
    @Autowired
    private SoftSkillService skillServ;
    
    //Enlaza con el repositorio
    @Autowired
    public SoftSkillRepo skillRepo;
    
    //Este metodo sirve para listar toda la educacion
    @GetMapping("/softSkill")
    public List<Soft_Skill> listarTodoSkill() {
        return skillServ.verSkill();
    } 
    
    //Este metodo sirve para guardar el empleado
    //Recibe en su cuerpo un objeto educacion
    @PostMapping("/softSkill")
    public void guardarSkill (@RequestBody Soft_Skill skill) {
        skillServ.crearSkill(skill);
    }
    
    @PutMapping("/softSkill")
        public void modificarSkill(@RequestBody Soft_Skill skill) {
        skillServ.editarSkill(skill);
    }
        
    //Este metodo sirve para buscar una educacion por su id
    @GetMapping("/softSkill/{id}")
    public Soft_Skill buscarSkill(@PathVariable Long id) {
        return skillRepo.findById(id).orElse(null);
    }
        
    @DeleteMapping ("/softSkill/{id}")    
    public void bajarSkill(@PathVariable Long id){
        skillServ.eliminarSkill(id);
    }
}
