package com.backend.portfolio.services.impl;

import com.backend.portfolio.model.ExperienciaLaboral;
import com.backend.portfolio.repositoy.ExperienciaLaboralRepository;
import com.backend.portfolio.services.ExperienciaLaboralService;
import java.util.LinkedList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralServiceImpl implements ExperienciaLaboralService {
    
    @Autowired
    private ExperienciaLaboralRepository experienciaLaboralRepository;

    @Override
    public ExperienciaLaboral guardarExperienciaLaboral(ExperienciaLaboral experienciaLaboral) throws Exception {
        /*ExperienciaLaboral experienciaLaboralLocal = experienciaLaboralRepository.getById( experienciaLaboral.getId());
        if (experienciaLaboralLocal != null){
            System.out.println("El dato ingresado ya existe");
            throw new Exception("El dato ingresado ya existe");
        }else{*/
          ExperienciaLaboral  experienciaLaboralLocal = experienciaLaboralRepository.save(experienciaLaboral);
        //}
        return experienciaLaboralLocal;      
    }

    @Override
    public ExperienciaLaboral obtenerExperienciaLaboral(Long id) {
        return experienciaLaboralRepository.findOneById(id);
    }

    @Override
    public void eliminarExperienciaLaboral(Long id) {
        experienciaLaboralRepository.deleteById(id);
    }

    /*@Override
    public LinkedList<ExperienciaLaboral> listarExperienciaLaboral(Long id) {
        return listarExperienciaLaboral(id);
    }*/
    
}
