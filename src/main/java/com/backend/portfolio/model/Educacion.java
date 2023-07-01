package com.backend.portfolio.model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Educacion{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String tipoEducacion;
    private String fechaInicio;
    private String fechaFin;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;
    

    public Educacion() {
    }

    public Educacion(Long id, String nombre, String tipoEducacion, String fechaInicio, String fechaFin, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.tipoEducacion = tipoEducacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoEducacion() {
        return tipoEducacion;
    }

    public void setTipoEducacion(String tipoEducacion) {
        this.tipoEducacion = tipoEducacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

 

}
