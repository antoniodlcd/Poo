// Verifica si un número es negativo, positivo o cero

import java.util.Scanner;

public class _p21_VerificarNumero {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Determina si un número es negativo, positivo o cero\n");
        
        System.out.print("Dame un número entero ? ");
        int num = new Scanner(System.in).nextInt();

        if (num > 0) System.out.println("Es positivo");
        if (num < 0) System.out.println("Es negativo");
        if (num == 0) System.out.println("Es cero");

        System.out.println("\nGracias por usar este super sistema");
    }
}
