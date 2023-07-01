package com.backend.portfolio.services.impl;

import com.backend.portfolio.model.Educacion;
import com.backend.portfolio.model.ExperienciaLaboral;
import com.backend.portfolio.model.Usuario;
import com.backend.portfolio.model.UsuarioRol;
import com.backend.portfolio.repositoy.EducacionRepository;
import com.backend.portfolio.repositoy.ExperienciaLaboralRepository;
import com.backend.portfolio.repositoy.RolRepository;
import com.backend.portfolio.repositoy.UsuarioRepository;
import com.backend.portfolio.services.UsuarioService;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private RolRepository rolRepository;    
    
    @Autowired
    private EducacionRepository educacionRepository;
    
    @Autowired
    private ExperienciaLaboralRepository experienciaRepository;
    
    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles, Set<Educacion> educacion, Set<ExperienciaLaboral> experiencia) throws Exception {
        Usuario usuarioLocal = usuarioRepository.findByUsername(usuario.getUsername());
        if (usuarioLocal != null) {
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya está presente");
        } else {
            for (UsuarioRol usuarioRol : usuarioRoles) {
                rolRepository.save(usuarioRol.getRol());
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuario.getListaEducacion().addAll(educacion);
            usuario.getExperienciaLaboral().addAll(experiencia);
            usuarioLocal = usuarioRepository.save(usuario);
        }
        return usuarioLocal;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        return usuarioRepository.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }

}
