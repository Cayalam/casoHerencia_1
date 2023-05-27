package modelo;

public class LibroDeColeccion extends Libro 
{
    private String nombreColeccion;
    private String numeroColeccion;
    


public LibroDeColeccion(String titulo,String autor,int anio, Boolean lujo,String nombreColeccion, String numeroColeccion) {
    super(titulo, autor, anio, lujo);
    this.nombreColeccion = nombreColeccion;
    this.numeroColeccion = numeroColeccion;
    
}

public String getNombreColeccion() {
    return nombreColeccion;
}

public String getNumeroColeccion() {
    return numeroColeccion;
}

}
