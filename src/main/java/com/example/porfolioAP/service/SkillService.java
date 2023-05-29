/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.service;

import com.example.porfolioAP.modelo.Skill;
import com.example.porfolioAP.modelo.Tipo_Skill;
import com.example.porfolioAP.repository.SkillRepo;
import com.example.porfolioAP.repository.SkillTipoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class SkillService implements ISkillService{
    @Autowired
    public SkillRepo skillRepo; 
    
    @Autowired
    public SkillTipoRepo tipoSkillRepo;
    
    @Override
    public List<Skill> verSkill () {
        return skillRepo.findAll();
    }
    
    @Override
    public void editarSkill(Skill skill) {
        List<Skill> listaSkills = verSkill();
        boolean flag = false;
        
        for(Skill skEncontrada : listaSkills) {
            Long id = skill.getId();
            if(skEncontrada.getId() == id) {
                skEncontrada.setNombre(skill.getNombre());
                skEncontrada.setPorcentaje(skill.getPorcentaje());
                skEncontrada.setTipo_skill(skill.getTipo_skill());
                //skillRepo.save(skill);
                flag = true;
            }
        }
        
        if(flag == false) {
            System.out.println("El id no corresponde a ningun dato en la BD");

        }
    }
    
    @Override
    public Skill crearSkill(Skill skill) {
        //skill.setTipo_skill(tipo_skill);
        return skillRepo.save(skill);
    }
    
    @Override
    public Skill obtenerSkillPorId(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
    
    @Override
    public void eliminarSkill(Long id) {
        skillRepo.deleteById(id);
    }
}
