package vista ;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultado  extends JPanel{
    
    private JTextArea taResultado;
    private JScrollPane spResultado;
  
    public PanelResultado() {

    this.setLayout(null);
    this.setBackground(Color.BLACK);
    
    //Creación de area donde se van a imprimir los resultados
    taResultado= new JTextArea();
    
    // Creación de barra desplazadora por si la respuesta es muy larga
    spResultado = new JScrollPane(taResultado);
    spResultado.setBounds(10,20,560,100);
    this.add(spResultado);

    //borde del panel
    TitledBorder borde= BorderFactory.createTitledBorder("Resultado");
    borde.setTitleColor(Color.WHITE);
    this.setBorder(borde);
    }
    //Mostrar resultado
    public void mostrarResultado(String toString) {
      taResultado.append(toString + "\n");
    }

    // Para borrar el area de texto
    public void borrar() {
        taResultado.setText("");
    }    
}
