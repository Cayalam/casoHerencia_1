package vista ;

import javax.swing.JFrame;
import java.awt.Color ;
public class VentanaPrincipal extends JFrame {

    //Atributos
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultado miPanelResultado;
    public VentanaPrincipal() {
        this. setLayout(null);
        this.setBackground(Color.WHITE);

        // Creación de panel entrada datos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,580,290);
        this.add(miPanelEntradaDatos);

        // Creación panel operaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,310,580,120);
        this.add(miPanelOperaciones);

        // Creación panel resultados
        miPanelResultado = new PanelResultado();
        miPanelResultado.setBounds(10,440,580,130);
        this.add(miPanelResultado);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        // Titulo de la ventana
        this.setTitle("Libreria");
        this.setSize(600,620);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }    
}
