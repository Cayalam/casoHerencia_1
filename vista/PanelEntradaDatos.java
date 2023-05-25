package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel {
    
    // Atributos
    private JLabel lbLibro;
    private JComboBox cbLibro;

    
  

public PanelEntradaDatos() {

    // Creación etiqueta (Titulo)
    lbLibro= new JLabel("Tipo de libro:");
    lbLibro.setFont(new Font("Arial",Font.BOLD,19));
    lbLibro.setForeground(Color.BLACK);
    lbLibro.setBounds(150,20,300,25);
    this.add(lbLibro);
    cbLibro = new JComboBox();
    cbLibro.setBounds(150, 50, 300, 25);
    cbLibro.addItem("Libro Normal");
    cbLibro.addItem("Libro de Coleccion");
    this.add(cbLibro);



   

    
   

   

   

    this.setLayout(null);
    this.setBackground(Color.white);

    // Borde de el Panel
    TitledBorder borde= BorderFactory.createTitledBorder("Panel de Entrada datos");
        borde.setTitleColor(Color.RED);
        this.setBorder(borde);
   }

   

   //Metodo para borrar cajas de texto
   public void borrar() {
       
   }    
}

