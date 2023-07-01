/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.service;

import com.example.porfolioAP.modelo.Soft_Skill;
import com.example.porfolioAP.repository.SoftSkillRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class SoftSkillService implements ISoftSkillService{
    @Autowired
    public SoftSkillRepo skillRepo; 
    
    @Override
    public List<Soft_Skill> verSkill () {
        return skillRepo.findAll();
    }
    
    @Override
    public void editarSkill(Soft_Skill skill) {
        List<Soft_Skill> listaSoftSkill = verSkill();
        boolean flag = false;
        
        for(Soft_Skill sk : listaSoftSkill) {
            Long id = sk.getId();
            if(skill.getId() == id) {
                skillRepo.save(skill);
                flag = true;
            }
        }
        
        if(flag == false) {
            System.out.println("El id no corresponde a ningun dato en la BD");

        }
    }
    
    @Override
    public Soft_Skill crearSkill(Soft_Skill skill) {
        //skill.setTipo_skill(tipo_skill);
        return skillRepo.save(skill);
    }
    
    @Override
    public Soft_Skill obtenerSkillPorId(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
    
    @Override
    public void eliminarSkill(Long id) {
        skillRepo.deleteById(id);
    }
}
