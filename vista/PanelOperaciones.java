package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel {
    
    // Creación de botones
    public JButton bCalcularImpuesto;
    public JButton bBorrar;
    public JButton bSalir;
   
    public PanelOperaciones() {

        this.setLayout(null);
        this.setBackground(Color.white);

        //Creación del boton calcular impuesto
        bCalcularImpuesto = new JButton("Calcular impuesto");
        bCalcularImpuesto.setFont(new Font("Arial",Font.BOLD, 12));
        bCalcularImpuesto.setActionCommand("calcular");
        bCalcularImpuesto.setBounds(65,30,450,25);
        this.add(bCalcularImpuesto);
        
        // Creación del boton borrar
        bBorrar = new JButton("Borrar");
        bBorrar.setActionCommand("borrar");
        bBorrar.setBounds(150,80,105,25);
        this.add(bBorrar);

        // Creación del boton salir
        bSalir = new JButton("Salir");
        bSalir.setActionCommand("salir");
        bSalir.setBounds(310,80,105,25);
        this.add(bSalir);

        // Borde de el Panel
        TitledBorder borde= BorderFactory.createTitledBorder("Panel de Operaciones");
            borde.setTitleColor(Color.RED);
            this.setBorder(borde);
    }
}