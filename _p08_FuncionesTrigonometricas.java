// Calcula funciones trigonométricas de un ángulo en radianes

import java.util.Scanner;

public class _p08_FuncionesTrigonometricas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();  // Borrar pantalla de la consola

        System.out.print("Dame un ángulo en Grados: ");
        double angulog = new Scanner(System.in).nextDouble();
        double angulor = Math.toRadians(angulog);

        double sen = Math.sin(angulor);
        double cos = Math.cos(angulor);
        double tan = Math.tan(angulor);

        System.out.println(String.format("El ángulo es: %.2f, \nSeno: %.2f, \nCoseno: %.2f, \nTangente: %.2f", angulor,sen,cos,tan));

    }
}
