package modelo;

import java.awt.List;
import java.util.ArrayList;

public class Libro {
    protected  String titulo;
    protected  String autor;
    protected  int anio;
    protected   Boolean lujo;



    public Libro(String titulo, String autor, int anio, Boolean lujo) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.lujo = lujo;
    }
       

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public Boolean getLujo() {
        return lujo;
    }
    



    
}
