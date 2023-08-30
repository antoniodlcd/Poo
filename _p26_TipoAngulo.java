// Muestra el tipo de ángulo según los grados

import java.util.Scanner;

public class _p26_TipoAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Muestra el tipo de ángulo según los grados\n");   
        System.out.print("Dame un número entre 0 y 360 grados ? ");
        int angulo = new Scanner(System.in).nextInt();
        
        System.out.print("El ángulo que introdujiste: \n");
        if (angulo < 90)
            System.out.println("Es agudo");
        if (angulo == 90)
            System.out.println("Es recto");
        if (angulo > 90 && angulo < 180)
            System.out.println("Es obtuso");
        if (angulo == 180)
            System.out.println("Es llano");
        if (angulo > 180 && angulo < 360)
            System.out.println("Es cóncavo");
        if (angulo == 360)
            System.out.println("Es completo");
        
        System.out.println("\nProceso terminado...");
    }
}
