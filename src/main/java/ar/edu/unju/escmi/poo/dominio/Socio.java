package ar.edu.unju.escmi.poo.dominio;

public class Socio extends Usuario{
    private String codigo;

    public Socio(String nombre, String direccion, String numeroTelefono, String dni, String codigo) {
        super(nombre, direccion, numeroTelefono, dni);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void mostrarAtributos(Socio socio){
        System.out.println("Nombre: " + socio.getNombre());
        System.out.println("Direccion: " + socio.getDireccion());
        System.out.println("Numero de telefono: " + socio.getNumeroTelefono());
        System.out.println("DNI: " + socio.getDni());
        System.out.println("Codigo: " + socio.getCodigo());
    }

    public void mostrarPrestamos(Socio socio){
        //System.out.println("Prestamos: " + socio.buscarPrestamo(socio.getDni()));
    }
}
