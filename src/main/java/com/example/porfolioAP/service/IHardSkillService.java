/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.porfolioAP.service;

import com.example.porfolioAP.modelo.Hard_Skill;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IHardSkillService {
    public List<Hard_Skill> verSkill ();
    public void editarSkill(Hard_Skill skill);
    public Hard_Skill crearSkill(Hard_Skill skill);
    public Hard_Skill obtenerSkillPorId(Long id);
    public void eliminarSkill(Long id);
}
