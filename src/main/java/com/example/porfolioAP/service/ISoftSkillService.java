/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.porfolioAP.service;

import com.example.porfolioAP.modelo.Soft_Skill;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ISoftSkillService {
    public List<Soft_Skill> verSkill ();
    public void editarSkill(Soft_Skill skill);
    public Soft_Skill crearSkill(Soft_Skill skill);
    public Soft_Skill obtenerSkillPorId(Long id);
    public void eliminarSkill(Long id);
}
