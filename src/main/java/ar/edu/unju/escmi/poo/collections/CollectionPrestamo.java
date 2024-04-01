package ar.edu.unju.escmi.poo.collections;

import ar.edu.unju.escmi.poo.dominio.Prestamo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class CollectionPrestamo {
    public static List<Prestamo> prestamos = new ArrayList<Prestamo>();

    public void precargarPrestamos(){
        //public Prestamo(LocalDate fechaDeInicio, LocalDate fechaVencimiento, Usuario usuario, List<Libro> libros) {
        prestamos.add(new Prestamo(LocalDate.now(), LocalDate.now().plusDays(7), CollectionUsuario.usuarios.get(6), CollectionLibro.libros.subList(0, 2)));
        //prestamos.add(new Prestamo(LocalDate.now(), LocalDate.now().plusDays(7), CollectionUsuario.usuarios.get(7), CollectionLibro.libros.subList(2, 4)));
    }
}
