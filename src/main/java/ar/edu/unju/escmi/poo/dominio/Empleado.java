package ar.edu.unju.escmi.poo.dominio;

import ar.edu.unju.escmi.poo.collections.CollectionLibro;
import ar.edu.unju.escmi.poo.collections.CollectionPrestamo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    // Un empleado puede buscar un préstamo ingresando el dni del socio, se muestran todos
    // los detalles del préstamo encontrado.
    public void buscarMostrarPrestamo(String dni){
        for (Prestamo prestamo : CollectionPrestamo.prestamos) {
            if (prestamo.getUsuario().getDni().equals(dni)) {
                Prestamo.mostrarDatos(prestamo);
            }
        }
    }

    /*public void mostrarPrestamos(String dni){
        List<Prestamo> prestamos = buscarPrestamosPorDni(dni);
        for (Prestamo prestamo : prestamos) {
            System.out.println("Fecha de inicio: " + prestamo.getFechaDeInicio());
            System.out.println("Fecha de vencimiento: " + prestamo.getFechaVencimiento());
            System.out.println("Estado: " + prestamo.getEstado());
            System.out.println("Usuario: " + prestamo.getUsuario());
            System.out.println("Libros: " + prestamo.getLibros());
        }
    }

    private List<Prestamo> buscarPrestamosPorDni(String dni){
        List<Prestamo> prestamosPorCliente = new ArrayList<>();
        for (Prestamo prestamo : CollectionPrestamo.prestamos) {
            if (prestamo.getUsuario().getDni().equals(dni)) {
                prestamosPorCliente.add(prestamo);
            }
        }
        return prestamosPorCliente;
    }
    */

    //Un empleado puede prestar libros a un socio, el objeto préstamo es guardado en la
    //collection de préstamos.
    public void prestarLibros(Socio socio, List<Libro> libros, int cantidadDias){
        Prestamo prestamo = new Prestamo(LocalDate.now(), LocalDate.now().plusDays(cantidadDias), (Usuario) socio,  libros);
        socio.getPrestamos().add(prestamo); // coleccion personal
        CollectionPrestamo.prestamos.add(prestamo); // coleccion general
    }

    //Un empleado puede buscar un libro, para ello necesita que se proporcione el título del
    //libro, retorna un objeto libro
    public Libro buscarLibro(String titulo){
        for (Libro libro : CollectionLibro.libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }
}
