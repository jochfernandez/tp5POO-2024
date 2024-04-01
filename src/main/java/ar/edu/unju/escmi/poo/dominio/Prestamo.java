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

   public Prestamo() {
    }

    public Prestamo(LocalDate fechaDeInicio, LocalDate fechaVencimiento, Usuario usuario, List<Libro> libros) {
        this.fechaDeInicio = fechaDeInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = Estado.ACTIVO;
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

    // Metodos
    // Retorna un valor entero que es la cantidad de días que hay entre fecha inicio y fecha vencimiento.
    public Integer cantidadDeDias(LocalDate fechaDeInicio, LocalDate fechaVencimiento){
        return fechaVencimiento.getDayOfYear() - fechaDeInicio.getDayOfYear();
    }

    //  Muestra los datos del préstamo.
    public static void mostrarDatos(Prestamo prestamo){
        System.out.println("Fecha de inicio: " + prestamo.getFechaDeInicio());
        System.out.println("Fecha de vencimiento: " + prestamo.getFechaVencimiento());
        System.out.println("Estado: " + prestamo.getEstado());
        System.out.println("Usuario: " + prestamo.getUsuario());
        System.out.println("Libros: " + prestamo.getLibros());
    }
    // Actualiza el valor del estado del préstamo, es activo si no se superó
    // la fecha de vencimiento, es vencido si fecha actual es posterior a fecha vencimiento.
    public void actualizarEstado(Prestamo prestamo){
        LocalDate fechaActual = LocalDate.now();
        if(fechaActual.isAfter(prestamo.getFechaVencimiento())){
            prestamo.setEstado(Estado.VENCIDO);
        }
    }
}
