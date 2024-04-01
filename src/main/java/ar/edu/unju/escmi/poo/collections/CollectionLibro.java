package ar.edu.unju.escmi.poo.collections;

import ar.edu.unju.escmi.poo.dominio.Libro;

import java.util.ArrayList;
import java.util.List;

public abstract class CollectionLibro {
    public static List<Libro> libros = new ArrayList<Libro>();

    public void precargarLibros(){
        //public Libro(String titulo, String autor, String ISBN, String genero, String anioPublicacion, Boolean estado) {
        libros.add(new Libro("El Aleph", "Jorge Luis Borges", "978-950-04-0406-1", "Ficción", "1949", true));
        libros.add(new Libro("El túnel", "Ernesto Sábato", "978-950-04-0406-1", "Ficción", "1948", true));
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", "978-84-376-0494-7", "Ficción", "1967", true));
        libros.add(new Libro("Rayuela", "Julio Cortázar", "978-84-376-0494-7", "Ficción", "1963", true));
        libros.add(new Libro("La ciudad y los perros", "Mario Vargas Llosa", "978-84-376-0494-7", "Ficción", "1963", true));
    }
}
