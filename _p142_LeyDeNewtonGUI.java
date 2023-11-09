import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class _p142_LeyDeNewtonGUI extends JFrame implements ActionListener, ChangeListener{
    JPanel p1;
    JLabel lblFuerza,lblMasa,lblAceleracion;
    JTextField txtFuerza, txtMasa, txtAceleracion;
    ButtonGroup grupoOpciones;
    JRadioButton rbtFuerza, rbtMasa, rbtAceleracion;
    JButton btnCalcular, btnSalir;

    public _p142_LeyDeNewtonGUI () {
        super("Calcular 2da Ley de Newton");
        setLayout(new FlowLayout());

        p1 = new JPanel();
        p1.setLayout(new GridLayout(5,2));

        // etiquetas
        lblFuerza = new JLabel("Fuerza : ", JLabel.RIGHT); p1.add(lblFuerza);  
        txtFuerza = new JTextField(); p1.add(txtFuerza);
        
        lblMasa = new JLabel("Masa : ", JLabel.RIGHT); p1.add(lblMasa); 
        txtMasa = new JTextField(); p1.add(txtMasa);

        lblAceleracion = new JLabel("Aceleración : ", JLabel.RIGHT); p1.add(lblAceleracion); 
        txtAceleracion = new JTextField(); p1.add(txtAceleracion);

        grupoOpciones = new ButtonGroup();

        // botones de radio
        rbtFuerza      = new JRadioButton("Fuerza");      grupoOpciones.add(rbtFuerza);
        rbtMasa        = new JRadioButton("Masa");        grupoOpciones.add(rbtMasa);
        rbtAceleracion = new JRadioButton("Aceleración"); grupoOpciones.add(rbtAceleracion);

        p1.add(rbtFuerza);
        p1.add(rbtMasa);
        p1.add(rbtAceleracion);
        
        add(p1);

        // botones
        btnCalcular = new JButton("Calcular"); add(btnCalcular);
        btnSalir    = new JButton("Salir");    add(btnSalir);

        rbtFuerza.addChangeListener(this);
        rbtMasa.addChangeListener(this);
        rbtAceleracion  .addChangeListener(this);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }
    
    public void stateChanged(ChangeEvent e) {
        txtFuerza.setEnabled(true);
        txtMasa.setEnabled(true);
        txtAceleracion.setEnabled(true);

        if(rbtFuerza.isSelected()) {
            txtFuerza.setEnabled(false);
        } else if (rbtMasa.isSelected()) {
            txtMasa.setEnabled(false);
        } else {
            txtAceleracion.setEnabled(false);
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        float f,m,a;
        
        if (e.getSource() == btnCalcular) {
            try {
                
                if (rbtFuerza.isSelected()) {
                    m = Float.parseFloat(txtMasa.getText());
                    a = Float.parseFloat(txtAceleracion.getText());
                    
                    f = m * a;

                    txtFuerza.setText(String.format("%.2f", f));

                } else if (rbtMasa.isSelected()) {
                    
                    f = Float.parseFloat(txtAceleracion.getText());
                    a = Float.parseFloat(txtAceleracion.getText());
                    
                    m = f / a;

                    txtMasa.setText(String.format("%.2f", m));

                } else if (rbtAceleracion.isSelected()) {
                    
                    f = Float.parseFloat(txtFuerza.getText());
                    m = Float.parseFloat(txtMasa.getText());
                    
                    a = f / m;

                    txtAceleracion.setText(String.format("%.2f", a));
                }


            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Faltan Valores", 
                "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnSalir) {
            dispose();
        }
    }
    
    public static void main(String[] args) {
        _p142_LeyDeNewtonGUI app = new _p142_LeyDeNewtonGUI();
        app.setBounds(10, 10, 300, 200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
