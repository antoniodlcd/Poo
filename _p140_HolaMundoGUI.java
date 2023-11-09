import java.awt.Font;
import javax.swing.*;

public class _p140_HolaMundoGUI extends JFrame{

    private JLabel lblSaludo;

    // configuración de la etiqueta
    public _p140_HolaMundoGUI() {
        setLayout(null);
        lblSaludo = new JLabel("Hola Mundo GUI, Bienvenido");
        lblSaludo.setFont(new Font("Arial",Font.BOLD,30));
        lblSaludo.setBounds(10,20,500,30);
        add(lblSaludo);
    }

    public static void main(String[] args) {
        _p140_HolaMundoGUI app = new _p140_HolaMundoGUI();
        app.setBounds(10, 10, 500, 300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);                           // Despega la pantalla
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);    // cuando se salga de la pantalla, cierra la aplicación
    }
}