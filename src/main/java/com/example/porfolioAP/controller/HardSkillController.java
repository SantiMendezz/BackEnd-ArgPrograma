/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.controller;

import com.example.porfolioAP.modelo.Hard_Skill;
import com.example.porfolioAP.repository.*;
import com.example.porfolioAP.service.*;
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
//@CrossOrigin(origins = "https://frontend-argprograma-santi.web.app")
@CrossOrigin(origins = "https://localhost:4200")
public class HardSkillController {
    @Autowired
    private HardSkillService skillServ;
    
    //Enlaza con el repositorio
    @Autowired
    public HardSkillRepo skillRepo;
    
    //Este metodo sirve para listar toda la educacion
    @GetMapping("/hardSkill")
    public List<Hard_Skill> listarTodoSkill() {
        return skillServ.verSkill();
    } 
    
    //Este metodo sirve para guardar el empleado
    //Recibe en su cuerpo un objeto educacion
    @PostMapping("/hardSkill")
    public void guardarSkill (@RequestBody Hard_Skill skill) {
        skillServ.crearSkill(skill);
    }
    
    @PutMapping("/hardSkill")
        public void modificarSkill(@RequestBody Hard_Skill skill) {
        skillServ.editarSkill(skill);
    }
        
    //Este metodo sirve para buscar una educacion por su id
    @GetMapping("/hardSkill/{id}")
    public Hard_Skill buscarSkill(@PathVariable Long id) {
        return skillRepo.findById(id).orElse(null);
    }
        
    @DeleteMapping ("/hardSkill/{id}")    
    public void bajarSkill(@PathVariable Long id){
        skillServ.eliminarSkill(id);
    }
}
