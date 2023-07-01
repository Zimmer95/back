package com.backend.portfolio.services;

import com.backend.portfolio.model.Educacion;
import com.backend.portfolio.model.Usuario;
import java.util.Set;


public interface EducacionService {
    
    public Educacion guardarEducacion(Educacion educacion) throws Exception;
    public Educacion obtenerEducacion(Long id);
    public void eliminarEducacion(Long id);
    
}
