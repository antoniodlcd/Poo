package _p145_HolaMundoGUI_V1;

import javax.swing.*;
// import javax.swing.colorchooser.DefaultColorSelectionModel;
import javax.swing.table.DefaultTableModel;
// import javax.swing.table.*;

import java.awt.*;
import java.awt.event.*;
// import java.awt.*;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener{

    ArrayList<Estudiante> datos;
    JMenuBar mbrEstudiante;
    JMenu menuArchivo, menuAyuda;
    JMenuItem smnAbrir, smnGuardar, smnSalir, smnAcercaDe;
    JDialog jdlAcercaDe;
    JLabel lblDatos,lblNombre,lblEdad,lblPeso,lblCorreo;
    JTextField txtNombre, txtEdad, txtPeso, txtCorreo;
    JPanel pnlTabla, pnlDatos;
    DefaultTableModel modelo;
    JScrollPane spane;
    JTable tblDatos;

    

    public App() {
        super("Acutualización de datos de un Estudiante");

        // barra de menú
        mbrEstudiante = new JMenuBar();
        setJMenuBar(mbrEstudiante);

        menuArchivo = new JMenu("Archivo"); mbrEstudiante.add(menuArchivo);
        menuAyuda   = new JMenu("Ayuda");   mbrEstudiante.add(menuAyuda);

        smnAbrir    = new JMenuItem("Abrir");   menuArchivo.add(smnAbrir); smnAbrir.addActionListener(this);
        smnGuardar  = new JMenuItem("Guardar"); menuArchivo.add(smnGuardar); smnGuardar.addActionListener(this);
        menuArchivo.add(new JSeparator());
        smnSalir    = new JMenuItem("Salir");   menuArchivo.add(smnSalir); smnSalir.addActionListener(this);

        smnAcercaDe = new JMenuItem("Acerca de .."); menuAyuda.add(smnAcercaDe); smnAcercaDe.addActionListener(this);
        jdlAcercaDe = new JDialog(this, "Acerca de .."); 
        jdlAcercaDe.setSize(250,200);
        jdlAcercaDe.setLocationRelativeTo(this);

        lblDatos = new JLabel("<html>Programación Orientada a Objetos 1<br>Ángel Antonio de la Cruz Díaz", JLabel.CENTER);
        jdlAcercaDe.add(lblDatos);

        setLayout(new GridLayout(2,1,0,0));
        pnlTabla = new JPanel(); add(pnlTabla);

        
        spane = new JScrollPane();
        pnlTabla.add(spane);
        tblDatos = new JTable();
        tblDatos.getTableHeader().setBackground(Color.yellow);
        tblDatos.getTableHeader().setForeground(Color.black);
        spane.setViewportView(tblDatos);

        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre","Edad","Peso","Correo"});
        tblDatos.setModel(modelo);
    
        pnlDatos = new JPanel(); getContentPane().add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(4,2,0,0));
        
        lblNombre = new JLabel("Nombre"); lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        
        lblEdad = new JLabel("Edad"); lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);
        
        lblPeso = new JLabel("Peso"); lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPeso = new JTextField(); 
        pnlDatos.add(lblPeso);
        pnlDatos.add(txtPeso);
        
        lblCorreo = new JLabel("Correo"); lblCorreo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCorreo = new JTextField();
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);


        


    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == smnSalir) {
            dispose();
        } else if (e.getSource() == smnAcercaDe) {
            jdlAcercaDe.setVisible(true);
        }
    }

    public void cargarDatos() {
        Object[] obj = new Object[4];
        for ( int i = 0; i < datos.size() ; i++) {
            obj[0] = datos.get(i).getNombre();
            obj[1] = datos.get(i).getEdad();
            obj[2] = datos.get(i).getPeso();
            obj[3] = datos.get(i).getCorreo();
            modelo.addRow(obj);
        }
    } 


    public static void main(String[] args) {
        App app = new App();
        app.setBounds(10, 10, 550, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

        app.datos = Util.inicializaDatos();
        app.cargarDatos();
    }
    
}
