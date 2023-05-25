package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel {
    
    // Atributos
    private JLabel lbTitulo;
    private JLabel lbValor;
    private JTextField ftValor;
    private JLabel lbModelo;
    private JTextField ftModelo;
    private JLabel lbMatricula;
    private JTextField ftMatricula;
    private ImageIcon icon;
    private JLabel lbIcon;

public PanelEntradaDatos() {

    // Creación etiqueta (Titulo)
    lbTitulo= new JLabel("Datos a ingresar del carro");
    lbTitulo.setFont(new Font("Arial",Font.BOLD,19));
    lbTitulo.setForeground(Color.BLACK);
    lbTitulo.setBounds(150,20,300,25);
    this.add(lbTitulo);

    // Creación etiqueta coste del carro
    lbValor= new JLabel("Valor del carro:");
    lbValor.setFont(new Font("Arial",Font.BOLD,19));
    lbValor.setForeground(Color.BLACK);
    lbValor.setBounds(90,65,250,20);
    this.add(lbValor);

    // Creación caja de texto para ingresar el coste del carro
    ftValor= new JTextField();
    ftValor.setBounds(300,65,200,20);
    this.add(ftValor);

    // Creación etiqueta modelo del carro
    lbModelo= new JLabel("Modelo:");
    lbModelo.setFont(new Font("Arial",Font.BOLD,19));
    lbModelo.setForeground(Color.BLACK);
    lbModelo.setBounds(90,105,200,20);
    this.add(lbModelo);

    // Creación caja de texto para ingresar el modelo del carro    
    ftModelo= new JTextField();
    ftModelo.setBounds(300,105,200,20);
    this.add(ftModelo);
    
    // Creación etiqueta matricula del carro (Lugar)    
    lbMatricula= new JLabel("Lugar de registro:");
    lbMatricula.setFont(new Font("Arial",Font.BOLD,19));
    lbMatricula.setForeground(Color.BLACK);
    lbMatricula.setBounds(90,140,200,25);
    this.add(lbMatricula);

    // Creacion caja de tecto para ingresar el lugar donde esta registrado el carro
    ftMatricula= new JTextField();
    ftMatricula.setBounds(300,145,200,20);
    this.add(ftMatricula);

    // implementación de imagen
    icon = new ImageIcon(getClass().getResource("bettle.png"));
    lbIcon = new JLabel(icon);
    lbIcon.setBounds(285, 110, 300, 225);
    this.add(lbIcon);

    this.setLayout(null);
    this.setBackground(Color.white);

    // Borde de el Panel
    TitledBorder borde= BorderFactory.createTitledBorder("Panel de Entrada datos");
        borde.setTitleColor(Color.RED);
        this.setBorder(borde);
   }

   //Metodos de acceso a la información de las cajas de texto
   public String getValorCarro() {
       return ftValor.getText();
   }
   
   public String getModelo() {
       return ftModelo.getText();
   }
   
   public String getMatricula() {
       return ftMatricula.getText();
   }

   //Metodo para borrar cajas de texto
   public void borrar() {
       ftValor.setText("");
       ftModelo.setText("");
       ftMatricula.setText("");
   }    
}

