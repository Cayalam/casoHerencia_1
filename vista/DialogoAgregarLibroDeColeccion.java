package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogoAgregarLibroDeColeccion extends JDialog{

    // Atributos
    private JLabel lbTitulo;
    private JTextField tfTitulo;
    private JLabel lbAutor;
    private JTextField tfAutor;
    private JLabel lbAnio;
    private JTextField tfAnio;
    private JLabel lbLujo;
    private JTextField tfLujo;
    private JLabel lbNombreColeccion;
    private JTextField tfNombreColeccion;
    private JLabel lbNumeroColeccion;
    private JTextField tfNumeroColeccion;

    private JButton bAgregarLibroDeColeccion;
   
    public DialogoAgregarLibroDeColeccion(){
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

        // Creación etiqueta (Nombre Coleccion)
        lbNombreColeccion= new JLabel("Nombre Coleccion:");
        lbNombreColeccion.setBounds(20,140,100,25);
        this.add(lbNombreColeccion);

        // Creación caja de texto (Nombre Coleccion)
        tfNombreColeccion= new JTextField();
        tfNombreColeccion.setBounds(130,140,200,25);
        this.add(tfNombreColeccion);

        // Creación etiqueta (Numero Coleccion)
        lbNumeroColeccion= new JLabel("Numero Coleccion:");
        lbNumeroColeccion.setBounds(20,170,100,25);
        this.add(lbNumeroColeccion);

        // Creación caja de texto (Numero Coleccion)
        tfNumeroColeccion= new JTextField();
        tfNumeroColeccion.setBounds(130,170,200,25);
        this.add(tfNumeroColeccion);

        // Creación botón (Agregar Libro)
        bAgregarLibroDeColeccion= new JButton("Agregar Libro");
        bAgregarLibroDeColeccion.setBounds(130,200,200,25);
        bAgregarLibroDeColeccion.setActionCommand("agregarLibroDeColeccion");
        this.add(bAgregarLibroDeColeccion);








    }
    
    
    
}
