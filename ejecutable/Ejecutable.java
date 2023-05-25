package ejecutable;

import java.util.ResourceBundle.Control;

import controlador.Controlador;
import modelo.Libro;
import vista.VentanaPrincipal;

public class Ejecutable {
    public static void main(String[] args) {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Libro miLibro = new Libro();
        Controlador miControlador = new Controlador(miVentana, null);
    }
    
}
