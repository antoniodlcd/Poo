package _p146_HolaMundoGUI_V2;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener{

    ArrayList<Estudiante> datos;
    JMenuBar mbrEstudiante;
    JMenu menuArchivo, menuAyuda;
    JMenuItem smnAbrir, smnGuardar, smnSalir, smnAcercaDe;
    JDialog jdlAcercaDe;
    JLabel lblDatos,lblNombre,lblEdad,lblPeso,lblCorreo;
    JTextField txtNombre, txtEdad, txtPeso, txtCorreo;
    JPanel pnlTabla, pnlDatos, pnlBotones;
    DefaultTableModel modelo;
    JScrollPane spane;
    JTable tblDatos;
    JFileChooser fchArchivo;
    JButton btnAgregar, btnGrabar;

    

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

        setLayout(new GridLayout(3,1,0,0));
        pnlTabla = new JPanel(); add(pnlTabla);

        pnlTabla.setLayout(new BoxLayout(pnlTabla, BoxLayout.X_AXIS));
        add(pnlTabla);
        
        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        pnlTabla.add(spane);
        tblDatos = new JTable();
        tblDatos.getTableHeader().setBackground(Color.yellow);
        tblDatos.getTableHeader().setForeground(Color.black);
        spane.setViewportView(tblDatos);

        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre","Edad","Peso","Correo"});
        tblDatos.setModel(modelo);

        tblDatos.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int ren = tblDatos.rowAtPoint(e.getPoint());
                mostrarDatos(ren);
            }
        });
    
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

        // botones
        pnlBotones = new JPanel();
        btnAgregar = new JButton("Agregar"); btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);

        btnGrabar = new JButton("Grabar"); btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);

        add(pnlBotones);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == smnSalir) {
            dispose();
        } else if (e.getSource() == smnAcercaDe) {
            jdlAcercaDe.setVisible(true);
        } else if (e.getSource() == btnAgregar) {
            activarCampos(true);
            limpiarCampos();
            txtNombre.requestFocus();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
        } else if (e.getSource() == btnGrabar) {
            guardarCampos();
            limpiarCampos();
            activarCampos(true);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);

        } else if (e.getSource() == smnAbrir) {
            fchArchivo = new JFileChooser();
            fchArchivo.setCurrentDirectory(new File("."));
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", new String[]{"dat"}));
            int res = fchArchivo.showOpenDialog(null);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();
                try {
                    datos = Util.deserializarDatos(arch.getName());
                    this.cargarDatos();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            
        } else if (e.getSource() == smnGuardar) {
            fchArchivo = new JFileChooser();
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", new String[]{"dat"}));
            fchArchivo.setCurrentDirectory(new File("."));
            int res = fchArchivo.showSaveDialog(this);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();
                try {
                    Util.serializarDatos(arch.getName(),datos);
                    JOptionPane.showMessageDialog(this, "Datos Grabados en : " +
                    arch.getName(),"Correcto" ,JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public void mostrarDatos(int ren) {
        txtNombre.setText(datos.get(ren).getNombre());
        txtEdad.setText(Integer.toString(datos.get(ren).getEdad()));
        txtPeso.setText(Double.toString(datos.get(ren).getPeso()));
        txtCorreo.setText(datos.get(ren).getCorreo());
    }

    public void activarCampos(boolean act_des) {
        for (Component cp : pnlDatos.getComponents()) {
            if (cp instanceof JTextField){
                cp.setEnabled(act_des);
            }
        }
    }

    public void cargarDatos() {
        DefaultTableModel dm = (DefaultTableModel)tblDatos.getModel();
        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }

        Object[] obj = new Object[4];
        for ( int i = 0; i < datos.size() ; i++) {
            obj[0] = datos.get(i).getNombre();
            obj[1] = datos.get(i).getEdad();
            obj[2] = datos.get(i).getPeso();
            obj[3] = datos.get(i).getCorreo();
            modelo.addRow(obj);
        }
    } 

    public void limpiarCampos() {
        for (Component cp : pnlDatos.getComponents()) {
            if (cp instanceof JTextField){
                ((JTextField)cp).setText("");
            }
        }
    }

    public void guardarCampos() {
        Estudiante est = new Estudiante();
        est.setNombre(txtNombre.getText());
        est.setEdad(Integer.parseInt(txtEdad.getText()));
        est.setPeso(Double.parseDouble(txtPeso.getText()));
        est.setCorreo(txtCorreo.getText());

        datos.add(est);
        cargarDatos();
    }


    public static void main(String[] args) {
        App app = new App();
        app.setBounds(10, 10, 550, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

        app.datos = Util.inicializaDatos();
        app.cargarDatos();
        app.activarCampos(false);
        app.btnGrabar.setEnabled(false);
    }
    
}
