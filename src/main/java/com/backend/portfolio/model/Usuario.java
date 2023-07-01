package com.backend.portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "usuario")
public class Usuario implements UserDetails{
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    
    @Basic
    private String username;
    private String password;
    private String nombre;
    private String apellido;
    private String email;
    private String dni;
    private String telefono;
    private String sobre_mi;
    private String fotoPerfil;
    private boolean enabled=true;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuario")
    @JsonIgnore
    private Set<UsuarioRol> usuarioRoles = new HashSet<>();
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuario")
    private Set<Educacion> listaEducacion = new HashSet<>();
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuario")
    private Set<ExperienciaLaboral> experienciaLaboral = new HashSet<>();

    public Usuario() {
    }

    public Usuario(Long id, String username, String password, String nombre, String apellido, String email, String dni, String telefono, String sobre_mi, String fotoPerfil, Set<ExperienciaLaboral> experiencia, Set<Educacion> listaEducacion) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
        this.sobre_mi = sobre_mi;
        this.fotoPerfil = fotoPerfil;
        this.experienciaLaboral= new HashSet<>();
        this.listaEducacion = new HashSet<>();
    }
   

    public Set<ExperienciaLaboral> getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(Set<ExperienciaLaboral> experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public Set<Educacion> getListaEducacion() {
        return listaEducacion;
    }

    public void setListaEducacion(Set<Educacion> listaEducacion) {
        this.listaEducacion = listaEducacion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSobre_mi() {
        return sobre_mi;
    }

    public void setSobre_mi(String sobre_mi) {
        this.sobre_mi = sobre_mi;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    public Set<UsuarioRol> getUsuarioRoles() {
        return usuarioRoles;
    }

    public void setUsuarioRoles(Set<UsuarioRol> usuarioRoles) {
        this.usuarioRoles = usuarioRoles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       Set<Authority> autoridades = new HashSet<>();
       this.usuarioRoles.forEach(usuarioRol ->{
        autoridades.add(new Authority(usuarioRol.getRol().getNombre()));
       });
       return autoridades;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    
    
}
