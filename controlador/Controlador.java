package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

import modelo.Libro;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener{
    private VentanaPrincipal venPrim;
    private Libro miLibro;

    public Controlador(VentanaPrincipal venPrim, Libro miLibro) {
        this.venPrim = venPrim;
        this.miLibro = miLibro;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
