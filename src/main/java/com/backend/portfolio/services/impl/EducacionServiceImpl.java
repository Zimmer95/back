package com.backend.portfolio.services.impl;

import com.backend.portfolio.model.Educacion;
import com.backend.portfolio.repositoy.EducacionRepository;
import com.backend.portfolio.repositoy.UsuarioRepository;
import com.backend.portfolio.services.EducacionService;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServiceImpl implements EducacionService{
    
    @Autowired
    private EducacionRepository educacionRepository;
    

    @Override
    public Educacion guardarEducacion(Educacion educacion) throws Exception {
        
        //Educacion educacionLocal = educacionRepository.getById(educacion.getId());
        Educacion educacionLocal = educacionRepository.save(educacion);
        /*if (educacionLocal != null){
            System.out.println("El dato ingresado ya existe" + educacion);
            throw new Exception("El dato ingresado ya existe" + educacion);
        }else{
            System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK" + educacion);
            educacionLocal = educacionRepository.save(educacion);
        }*/
        return educacionLocal; 
    }
    

    @Override
    public Educacion obtenerEducacion(Long id) {
        return educacionRepository.findOneById(id);    
    }
  
    @Override
    public void eliminarEducacion(Long id) {
        educacionRepository.deleteById(id);    
    }

    /*@Override
    public Set<Educacion> slistarEducaciones(Long id) {
        return listarEducaciones(id);
    }
    @Override*/
    
    /*public Set<Educacion> listarEducaciones(Long id) {
    // Obtener el usuario por su ID
    Usuario usuario = usuarioRepository.getById(id);

    // Verificar si el usuario existe
    if (usuario != null) {
        // Obtener el conjunto de educaciones del usuario
        
    } else {
        // Retornar un conjunto vacío si el usuario no existe
        return Collections.emptySet();
    }*/
    
    
  


    
}
