package ar.edu.unju.escmi.poo.dominio;

import java.util.List;

public abstract class Usuario {
    protected String nombre;
    protected String direccion;
    protected String numeroTelefono;
    protected String dni;

    public Usuario(String nombre, String direccion, String numeroTelefono, String dni) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.dni = dni;
    }

    public Usuario(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public Boolean isSocio(Usuario usuario){
        if (usuario instanceof Socio) {
            return true;
        } else {
            return false;
        }
    }
}
