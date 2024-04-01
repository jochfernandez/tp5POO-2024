package ar.edu.unju.escmi.poo.dominio;

import java.util.List;

public class Socio extends Usuario{
    private String codigo;

    private List<Prestamo> prestamos;

    public Socio(){

    }

    public Socio(String nombre, String direccion, String numeroTelefono, String dni, String codigo, List<Prestamo> prestamos) {
        super(nombre, direccion, numeroTelefono, dni);
        this.codigo = codigo;
        this.prestamos = prestamos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    // Metodos
    // Mostrar los atributos del socio
    public void mostrarAtributos(Socio socio){
        System.out.println("Nombre: " + socio.getNombre());
        System.out.println("Direccion: " + socio.getDireccion());
        System.out.println("Numero de telefono: " + socio.getNumeroTelefono());
        System.out.println("DNI: " + socio.getDni());
        System.out.println("Codigo: " + socio.getCodigo());
    }
    // mostrar los prestamos del socio
    public void mostrarPrestamos(Socio socio){
        for (Prestamo prestamo : socio.getPrestamos()) {
            System.out.println("Fecha de inicio: " + prestamo.getFechaDeInicio());
            System.out.println("Fecha de vencimiento: " + prestamo.getFechaVencimiento());
            System.out.println("Estado: " + prestamo.getEstado());
            System.out.println("Usuario: " + prestamo.getUsuario());
            System.out.println("Libros: " + prestamo.getLibros());
        }
    }
    // Funcion Buscar socio por DNI
    public void buscarSocio(String dni, Socio socio){
        if (this.getDni().equals(dni)) {
            socio = this;
        }
    }

}
