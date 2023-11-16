import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _p143_PagaTrabjador extends JFrame implements ActionListener, ChangeListener{

    private JLabel lblHoras, lblPaga, lblTasa, lblPaga_bruta, lblImpuesto, lblPaga_neta;
    private JTextField txtHoras, txtPaga, txtTasa, txtPaga_bruta, txtImpuesto, txtPaga_neta;
    private JButton btnCalcular, btnSalir;
    
    public _p143_PagaTrabjador () {
        super("Calcular la paga de traabjador");
        setLayout (null);

        // etiquetas
        lblHoras = new JLabel("Horas Trabajadas :"); lblHoras.setBounds(10,10, 200, 50); add(lblHoras);
        lblPaga = new JLabel("Paga por hora ($):");     lblPaga.setBounds(10,70, 200, 50); add(lblPaga);
        lblTasa = new JLabel("Tasa de impuestos (%):"); lblTasa.setBounds(10,130, 200, 50); add(lblTasa);

        lblPaga_bruta = new JLabel("Paga bruta ($):");lblPaga_bruta.setBounds(300,15,200,50); add(lblPaga_bruta);
        lblImpuesto = new JLabel("Impuesto ($):");lblImpuesto.setBounds(300,75,200,50); add(lblImpuesto);
        lblPaga_neta = new JLabel("Paga neta ($):");lblPaga_neta.setBounds(300,135,200,50); add(lblPaga_neta);

        // cuadros de texto
        txtPaga_bruta = new JTextField(); txtPaga_bruta.setBounds(410,15, 120, 35); add(txtPaga_bruta);
        txtImpuesto = new JTextField(); txtImpuesto.setBounds(410,75, 120, 35); add(txtImpuesto);
        txtPaga_neta = new JTextField(); txtPaga_neta.setBounds(410,135,120,35); add(txtPaga_neta);

        txtHoras = new JTextField(); txtHoras.setBounds(150,15, 120, 35); add(txtHoras);
        txtPaga = new JTextField(); txtPaga.setBounds(150,75, 120, 35); add(txtPaga);
        txtTasa = new JTextField(); txtTasa.setBounds(150,135, 120, 35); add(txtTasa);

        // botones
        btnCalcular = new JButton("Calcular"); btnCalcular.setBounds(100,200,100,40); add(btnCalcular);
        btnSalir = new JButton("Salir"); btnSalir.setBounds(350,200,100,40); add(btnSalir);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);

    }

    

    @Override
    public void stateChanged(ChangeEvent e) {
        txtPaga_bruta.setEnabled(false);        
        txtImpuesto.setEnabled(false);        
        txtPaga_neta.setEnabled(false);        
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            try { 
                float horas, paga, tasa, impuesto, paga_bruta, paga_neta;
                
                horas = Float.parseFloat(txtHoras.getText());
                paga = Float.parseFloat(txtPaga.getText());
                tasa = (Float.parseFloat(txtTasa.getText())) / 100;
                
                paga_bruta = horas * paga;
                impuesto = paga_bruta * tasa;
                paga_neta = paga_bruta - impuesto;
                
                txtPaga_bruta.setText(String.format("%.2f$", paga_bruta));
                txtImpuesto.setText(String.format("%.2f$", impuesto));
                txtPaga_neta.setText(String.format("%.2f$", paga_neta));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Faltan valores", 
                "Error !!", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnSalir) {
            dispose();
        }
    }

    public static void main(String[] args) {
        _p143_PagaTrabjador app = new _p143_PagaTrabjador();
        app.setBounds(10, 10, 550, 300);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
