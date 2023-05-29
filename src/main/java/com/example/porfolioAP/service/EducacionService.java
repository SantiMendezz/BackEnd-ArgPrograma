package com.example.porfolioAP.service;

import com.example.porfolioAP.modelo.Educacion;
import java.util.List;

public interface EducacionService {
    public List<Educacion> verEducacion ();
    public void editarPersona(Educacion educ);
    public Educacion crearEducacion(Educacion educ);
    public Educacion obtenerEducacionPorId(Long id);
    public void eliminarEducacion(Long id);
}