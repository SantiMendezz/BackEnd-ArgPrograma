/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.porfolioAP.service;

import com.example.porfolioAP.modelo.Skill;
import com.example.porfolioAP.modelo.Tipo_Skill;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ISkillService {
    public List<Skill> verSkill ();
    public void editarSkill(Skill skill);
    public Skill crearSkill(Skill skill);
    public Skill obtenerSkillPorId(Long id);
    public void eliminarSkill(Long id);
}
