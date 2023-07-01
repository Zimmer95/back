package com.backend.portfolio.controller;

import com.backend.portfolio.model.Educacion;
import com.backend.portfolio.model.Usuario;
import com.backend.portfolio.services.EducacionService;
import java.util.Set;
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
@RequestMapping("/educacion")
@CrossOrigin("*")
public class EducacionController {
    
    @Autowired
    private EducacionService educacionService;

    //educacion
    
    @PostMapping("/")
    public Educacion guardarEducacion(@RequestBody Educacion educacion) throws Exception{
        return educacionService.guardarEducacion(educacion);
    }
    
    @GetMapping("/buscar/{id}")
    public Educacion obtenerEducacion(@PathVariable("id") Long id){
        return  this.educacionService.obtenerEducacion(id);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarEducacion(@PathVariable("id") Long id){
        educacionService.eliminarEducacion(id);
    }
}
