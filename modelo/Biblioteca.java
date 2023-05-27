package modelo;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro>miLibro; 
    private ArrayList<LibroDeColeccion>miLibroDeColeccion;
     public Biblioteca() {
        miLibro= new ArrayList<>();
        miLibroDeColeccion= new ArrayList<>();
    }
    
    
    public Libro getLibros(int i){
        return miLibro.get(i);
    }
    public void addLibros(Libro libro){
        miLibro.add(libro);
    }
    public LibroDeColeccion getLibroDeColeccion(int i){
        return miLibroDeColeccion.get(i);
    }
    public void addLibroDeColeccion(LibroDeColeccion libroDeColeccion){
        miLibroDeColeccion.add(libroDeColeccion);
    }
    public int sizeLibro(){
        return miLibro.size();
    }
    if(cbLibro.getSelectedItem().equals("Libro Normal")){
        Libro libro = new Libro(getTitulo(),getAutor(),getAnio(),getLujo());
        biblioteca.addLibros(libro);
    }
}
   


