package modelo;

public class Libro {
    protected String titulo;
    protected String autor;
    protected int anio;
    protected Boolean lujo;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.anio = 0;
        this.lujo = false;
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
