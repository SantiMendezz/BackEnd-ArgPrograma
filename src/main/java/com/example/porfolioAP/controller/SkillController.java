/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.controller;
/*
import com.example.porfolioAP.modelo.Skill;
import com.example.porfolioAP.modelo.Tipo_Skill;
import java.util.*;
import com.example.porfolioAP.repository.SkillRepo;
import com.example.porfolioAP.service.SkillService;
import com.example.porfolioAP.service.TipoSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
*/
/**
 *
 * @author HP
 */
/*
@RestController
@RequestMapping({"/api/v1/"})
//@CrossOrigin(origins = "https://frontend-argprograma-santi.web.app")
@CrossOrigin(origins = "https://localhost:4200")
public class SkillController {
    @Autowired
    private SkillService skillServ;
    
    @Autowired
    private TipoSkillService tipoSkillServ;
    
    //Enlaza con el repositorio
    @Autowired
    public SkillRepo skillRepo;
    
    //Este metodo sirve para listar toda la educacion
    @GetMapping("/skill")
    public List<Skill> listarTodoSkill() {
        return skillServ.verSkill();
    } 
    
    @GetMapping("/skill/tipo_skills_obtener")
    public List<Tipo_Skill> listarTodoTipoSkills() {
        return tipoSkillServ.encontrarTodosLosTipos();
    }
    
    //Este metodo sirve para guardar el empleado
    //Recibe en su cuerpo un objeto educacion
    @PostMapping("/skill")
    public void guardarSkill (@RequestBody Skill skill) {
        skillServ.crearSkill(skill);
    }
    
    @PutMapping("/skill")
        public void modificarPersona(@RequestBody Skill skill) {
        skillServ.editarSkill(skill);
    }
        
    //Este metodo sirve para buscar una educacion por su id
    @GetMapping("/skill/{id}")
    public Skill buscarSkill(@PathVariable Long id) {
        return skillRepo.findById(id).orElse(null);
    }
        
    @DeleteMapping ("/skill/{id}")    
    public void bajarSkill(@PathVariable Long id){
        skillServ.eliminarSkill(id);
    }
}
*/