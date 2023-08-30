// Muestra la estación del año en base al número

import java.util.Scanner;

public class _p25_EstacionesAño {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        
        System.out.println("Muestra la estación del año en base al número:\n");
        System.out.print("Dame un número (1 - 4) ? ");
        int num = new Scanner(System.in).nextInt();

        if (num == 1) System.out.println("Primavera");
        if (num == 2) System.out.println("Verano");
        if (num == 3) System.out.println("Otoño");
        if (num == 4) System.out.println("Invierno");

        System.out.println("\nProceso terminado...");
    }
}
