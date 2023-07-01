package com.backend.portfolio.controller;

import com.backend.portfolio.model.Educacion;
import com.backend.portfolio.model.ExperienciaLaboral;
import com.backend.portfolio.model.Rol;
import com.backend.portfolio.model.Usuario;
import com.backend.portfolio.model.UsuarioRol;
import com.backend.portfolio.services.EducacionService;
import com.backend.portfolio.services.UsuarioService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario)throws Exception{
        
        usuario.setPassword(this.bCryptPasswordEncoder.encode(usuario.getPassword()));
        
        Set<UsuarioRol> usuarioRoles = new HashSet<>();
        Set<Educacion> educacion = new HashSet<>();
        Set<ExperienciaLaboral> experiencia = new HashSet<>();

        Rol rol = new Rol();
        rol.setId(2L);
        rol.setNombre("NORMAL");

        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);

        usuarioRoles.add(usuarioRol);
        return usuarioService.guardarUsuario(usuario,usuarioRoles,educacion, experiencia);
    }
    
    @GetMapping("/buscar/{username}")
    public Usuario obtenerUsuario(@PathVariable("username") String username){
        return usuarioService.obtenerUsuario(username);
    }
     
    @DeleteMapping("/eliminar/{id}")
    public void eliminarUsuario(@PathVariable("id") Long id){
        usuarioService.eliminarUsuario(id);
    }
    
    
}
