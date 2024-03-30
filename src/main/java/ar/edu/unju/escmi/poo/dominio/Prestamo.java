package ar.edu.unju.escmi.poo.dominio;

import ar.edu.unju.escmi.poo.util.Estado;

import java.time.LocalDate;
import java.util.List;

public class Prestamo {
    private LocalDate fechaDeInicio;
    private LocalDate fechaVencimiento;
    private Estado estado;
    private Usuario usuario;
    private List<Libro> libros;

    public Prestamo(LocalDate fechaDeInicio, LocalDate fechaVencimiento, Estado estado, Usuario usuario, List<Libro> libros) {
        this.fechaDeInicio = fechaDeInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
        this.usuario = usuario;
        this.libros = libros;
    }

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public Integer cantidadDeDias(LocalDate fechaDeInicio, LocalDate fechaVencimiento){
        return fechaVencimiento.getDayOfYear() - fechaDeInicio.getDayOfYear();
    }
    public void mostrarDatos(Prestamo prestamo){
        System.out.println("Fecha de inicio: " + prestamo.getFechaDeInicio());
        System.out.println("Fecha de vencimiento: " + prestamo.getFechaVencimiento());
        System.out.println("Estado: " + prestamo.getEstado());
        System.out.println("Usuario: " + prestamo.getUsuario());
        System.out.println("Libros: " + prestamo.getLibros());
    }

    public void actualizarEstado(Prestamo prestamo){
        LocalDate fechaActual = LocalDate.now();
        if(fechaActual.isAfter(prestamo.getFechaVencimiento())){
            prestamo.setEstado(Estado.VENCIDO);
        }
    }
}
