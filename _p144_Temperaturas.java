import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout;

public class _p144_Temperaturas  extends JFrame{
    private JPanel p1;
    private JLabel lblCelsius, lblFahrenheit;
    private JTextField txtCelsius, txtFahrenheit;
    private ButtonGroup grupoOpciones;
    private JRadioButton rbtCelsius, rbtFahrenheit;
    private JButton btnCaltular, btnSalir;

    public _p144_Temperaturas() {
        super("Convertir Temperaturas");
        setLayout(new FlowLayout());

        p1 = new JPanel();
        p1.setLayout(new GridLayout(2,0));

        // etiquetas
        lblCelsius = new JLabel("Celsius", JLabel.RIGHT); p1.add(lblCelsius);
        txtCelsius = new JTextField(); p1.add(txtCelsius);

        lblFahrenheit = new JLabel("Fahrenheit",JLabel.RIGHT); p1.add(lblFahrenheit);
        txtFahrenheit = new JTextField(); p1.add(txtFahrenheit);

        // botones de radio
        grupoOpciones = new ButtonGroup();

        rbtCelsius = new JRadioButton("Celsius"); grupoOpciones.add(rbtCelsius);
        rbtFahrenheit = new JRadioButton("Fahrenheit"); grupoOpciones.add(rbtFahrenheit);
        
        p1.add(rbtCelsius);
        p1.add(rbtFahrenheit);

        add(p1);
    }


    public static void main(String[] args) {
        _p144_Temperaturas app = new _p144_Temperaturas();
        app.setBounds(10,10,400,300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
