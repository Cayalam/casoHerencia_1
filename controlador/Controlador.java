package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

import modelo.Biblioteca;
import modelo.Libro;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener{
    private VentanaPrincipal venPrim;
    private Biblioteca miBiblioteca;

    public Controlador(VentanaPrincipal venPrim, Biblioteca miBiblioteca) {
        this.venPrim = venPrim;
        this.miBiblioteca = miBiblioteca;
    
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
    if(comando.equals("agregar")){
        if(venPrim.getTipoLibro().equals("Libro")){
            Libro miLibro = new Libro(venPrim.getTitulo(), venPrim.getAutor(), Integer.parseInt(venPrim.getAnio()), venPrim.getLujo());
            miBiblioteca.addLibros(miLibro);
            venPrim.mostrarMensaje("Libro agregado");

    }
        
    }
    
}
