package ejecutable;

import java.util.ResourceBundle.Control;

import controlador.Controlador;
import vista.VentanaPrincipal;

public class Ejecutable {
    public static void main(String[] args) {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Controlador miControlador = new Controlador(miVentana);
    }
    
}
