package ar.edu.unju.escmi.poo.dominio;

public class Empleado extends Usuario{
    private String cargo;
    private Float sueldo;

    public Empleado(String nombre, String direccion, String numeroTelefono, String dni, String cargo, Float sueldo) {
        super(nombre, direccion, numeroTelefono, dni);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    /*public Prestamo buscarPrestamo(String dniSocio){

    }*/
}
