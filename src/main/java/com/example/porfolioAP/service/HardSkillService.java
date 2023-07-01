/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.service;

import com.example.porfolioAP.modelo.Hard_Skill;
import com.example.porfolioAP.repository.HardSkillRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class HardSkillService implements IHardSkillService{

    @Autowired
    public HardSkillRepo skillRepo; 
    
    @Override
    public List<Hard_Skill> verSkill () {
        return skillRepo.findAll();
    }
    
    @Override
    public void editarSkill(Hard_Skill skill) {
        List<Hard_Skill> listaHardSkill = verSkill();
        boolean flag = false;
        
        for(Hard_Skill sk : listaHardSkill) {
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
    public Hard_Skill crearSkill(Hard_Skill skill) {
        //skill.setTipo_skill(tipo_skill);
        return skillRepo.save(skill);
    }
    
    @Override
    public Hard_Skill obtenerSkillPorId(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
    
    @Override
    public void eliminarSkill(Long id) {
        skillRepo.deleteById(id);
    }
    
}
