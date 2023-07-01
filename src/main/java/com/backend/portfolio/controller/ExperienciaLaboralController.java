package com.backend.portfolio.controller;

import com.backend.portfolio.model.ExperienciaLaboral;
import com.backend.portfolio.services.ExperienciaLaboralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencia-laboral")
@CrossOrigin("*")
public class ExperienciaLaboralController {
    
    @Autowired
    private ExperienciaLaboralService experienciaLaboralService;
    
    
    @PostMapping("/")
    public ExperienciaLaboral guardarExperienciaLaboral(@RequestBody ExperienciaLaboral experienciaLaboral) throws Exception{
        return experienciaLaboralService.guardarExperienciaLaboral(experienciaLaboral);
    }
    
    @GetMapping("/buscar/{id}")
    public ExperienciaLaboral obtenerExperienciaLaboral(@PathVariable("id") Long id){
        return  experienciaLaboralService.obtenerExperienciaLaboral(id);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarExperienciaLaboral(@PathVariable("id") Long id){
        experienciaLaboralService.eliminarExperienciaLaboral(id);
    }
     
     
}
