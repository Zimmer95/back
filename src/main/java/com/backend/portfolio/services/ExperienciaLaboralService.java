package com.backend.portfolio.services;

import com.backend.portfolio.model.ExperienciaLaboral;
import java.util.LinkedList;

public interface ExperienciaLaboralService {
    
    public ExperienciaLaboral guardarExperienciaLaboral(ExperienciaLaboral experienciaLaboral) throws Exception;
    public ExperienciaLaboral obtenerExperienciaLaboral(Long id);
    public void eliminarExperienciaLaboral(Long id);
}