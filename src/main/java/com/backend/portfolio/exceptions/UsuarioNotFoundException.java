package com.backend.portfolio.exceptions;


public class UsuarioNotFoundException extends Exception{
    
    public UsuarioNotFoundException() {
        super("El usuario no se encuentra en la base de datos");
    }
    
    public UsuarioNotFoundException(String mensaje) {
        super(mensaje);
    }
    
}
