package com.backend.portfolio.exceptions;


public class UsuarioFoundException extends Exception{
    
     public UsuarioFoundException() {
        super("El usuario ya se encuentra en la base de datos");
    }
    
    public UsuarioFoundException(String mensaje) {
        super(mensaje);
    }
    
}
