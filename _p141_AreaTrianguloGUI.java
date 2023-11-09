import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class _p141_AreaTrianguloGUI extends JFrame implements ActionListener{
    JLabel lblBase, lblAltura, lblResultado;
    JTextField txtBase, txtAltura;
    JButton btnCalcular, btnSalir;

    public _p141_AreaTrianguloGUI() {
        super("Calcular el área de un triángulo");
        setLayout(null);

        // etiquetas
        lblBase = new JLabel("Base : "); lblBase.setBounds(10, 20, 200, 30); add(lblBase);
        lblAltura = new JLabel("Altura : "); lblAltura.setBounds(10, 50, 200, 30); add(lblAltura);
        lblResultado = new JLabel("[Resultado Aquí]"); lblResultado.setBounds(90, 80, 200, 30); add(lblResultado);
        
        // cuadros de texto
        txtBase = new JTextField(); txtBase.setBounds(80, 20, 200, 30); add(txtBase);
        txtAltura = new JTextField(); txtAltura.setBounds(80, 50, 200, 30); add(txtAltura);

        // botones
        btnCalcular = new JButton("Calcular"); btnCalcular.setBounds(30, 110, 100, 40); add(btnCalcular); btnCalcular.addActionListener(this);
        btnSalir = new JButton("Salir"); btnSalir.setBounds(150, 110, 100, 40); add(btnSalir); btnSalir.addActionListener(this);
    }

    public float getArea(float base, float altura) {
        return (base * altura) / 2;
    }

    public void actionPerformed (ActionEvent e) {
        if(e.getSource()==btnSalir) {
            dispose();
        } else if (e.getSource()==btnCalcular) {
            float base = Float.parseFloat(txtBase.getText());
            float altura = Float.parseFloat(txtAltura.getText());
            float area = getArea(base, altura);
            lblResultado.setText(String.format("%.2f", area));
        }
    }

    public static void main(String[] args) {
        _p141_AreaTrianguloGUI app = new _p141_AreaTrianguloGUI();
        app.setBounds(10,10,300,200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
