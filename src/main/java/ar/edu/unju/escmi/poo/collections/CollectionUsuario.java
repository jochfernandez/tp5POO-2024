package ar.edu.unju.escmi.poo.collections;

import ar.edu.unju.escmi.poo.dominio.Empleado;
import ar.edu.unju.escmi.poo.dominio.Socio;
import ar.edu.unju.escmi.poo.dominio.Usuario;

import java.util.ArrayList;
import java.util.List;

public abstract class CollectionUsuario {
    public static List<Usuario> usuarios = new ArrayList<Usuario>();

    public void precargaUsuarios(){
        //     public Empleado(String nombre, String direccion, String numeroTelefono, String dni, String cargo, Float sueldo)
        usuarios.add(new Empleado("Juan Perez", "Av. San Martin 123", "388-1234567", "12345678", "Analista", 50000f));
        usuarios.add(new Empleado("Maria Lopez", "Av. San Martin 123", "388-1234568", "12345679", "Gerente" , 80000f));
        usuarios.add(new Empleado("Carlos Gomez", "Av. San Martin 123", "388-1234569", "12345680", "Administrativo", 40000f));
        //     public Socio(String nombre, String direccion, String numeroTelefono, String dni, String codigo, List<Prestamo> prestamos)
        usuarios.add(new Socio("Pedro Martinez", "Av. San Martin 123", "388-1234570", "12345681", "1234", null));
        usuarios.add(new Socio("Ana Rodriguez", "Av. San Martin 123", "388-1234571", "12345682", "1235", null));
        usuarios.add(new Socio("Luisa Perez", "Av. San Martin 123", "388-1234572", "12345683", "1236", CollectionPrestamo.prestamos.subList(0, 1)));
    }
}
