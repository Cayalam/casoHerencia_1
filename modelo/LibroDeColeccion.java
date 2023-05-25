package modelo;

public class LibroDeColeccion extends Libro 
{
    private String nombreColeccion;
    private String numeroColeccion;

public LibroDeColeccion( String nombreColeccion,String numeroColeccion) {
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
