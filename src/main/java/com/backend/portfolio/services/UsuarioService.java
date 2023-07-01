package com.backend.portfolio.services;

import com.backend.portfolio.model.Educacion;
import com.backend.portfolio.model.ExperienciaLaboral;
import com.backend.portfolio.model.Usuario;
import com.backend.portfolio.model.UsuarioRol;
import java.util.Set;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface UsuarioService {
    
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRol, Set<Educacion> educacion,Set<ExperienciaLaboral> experiencia) throws Exception;
    public Usuario obtenerUsuario(String username);
    public void eliminarUsuario(Long usuarioId);

}
