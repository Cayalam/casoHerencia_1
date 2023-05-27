package vista;

import javax.management.relation.Role;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogoAgregarLibro extends JDialog 
{
    
    
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbTitulo;
    private JTextField tfTitulo;
    private JLabel lbAutor;
    private JTextField tfAutor;
    private JLabel lbAnio;
    private JTextField tfAnio;
    private JLabel lbLujo;
    private JTextField tfLujo;

    private JButton bAgregarLibro;



    //----------------------
    // Constructor
    //----------------------
    public DialogoAgregarLibro(){
        this.setLayout(null);

        // Creación etiqueta (Titulo)
        lbTitulo= new JLabel("Titulo:");
        lbTitulo.setBounds(20,20,100,25);
        this.add(lbTitulo);

        // Creación caja de texto (Titulo)
        tfTitulo= new JTextField();
        tfTitulo.setBounds(130,20,200,25);
        this.add(tfTitulo);

        // Creación etiqueta (Autor)
        lbAutor= new JLabel("Autor:");
        lbAutor.setBounds(20,50,100,25);
        this.add(lbAutor);

        // Creación caja de texto (Autor)
        tfAutor= new JTextField();
        tfAutor.setBounds(130,50,200,25);
        this.add(tfAutor);

        // Creación etiqueta (Año)
        lbAnio= new JLabel("Año:");
        lbAnio.setBounds(20,80,100,25);
        this.add(lbAnio);

        // Creación caja de texto (Año)
        tfAnio= new JTextField();
        tfAnio.setBounds(130,80,200,25);
        this.add(tfAnio);

        // Creación etiqueta (Lujo)
        lbLujo= new JLabel("Lujo:");
        lbLujo.setBounds(20,110,100,25);
        this.add(lbLujo);

        // Creación caja de texto (Lujo)
        tfLujo= new JTextField();
        tfLujo.setBounds(130,110,200,25);
        this.add(tfLujo);

        // Creación del boton calcular impuesto
        bAgregarLibro = new JButton("Agregar Libro");
        bAgregarLibro.setActionCommand("Agregar Libro");
        bAgregarLibro.setBounds(130,150,200,25);
        this.add(bAgregarLibro);

        this.setSize(400,250);
        this.setTitle("Agregar Libro");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setVisible(true);

    }



    //----------------------
    // Métodos de acesso
    //----------------------

    public String getTfTitulo()
     {
        return tfTitulo.getText();
    }
    public String getTfAutor() {
        return tfAutor.getText();
    }
    public String getTfAnio() {
        return tfAnio.getText();
    }
    public String getTfLujo() {
        return tfLujo.getText();
    }

    //----------------------
    // Constructor
    //----------------------
    


    
}
