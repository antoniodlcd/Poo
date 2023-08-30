// Convierte un número entero de entre 1 y 10 a número romano

import java.util.Scanner;

public class _p31_NumerosRomanos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        System.out.print("Convierte un número entero de entre 1 y 10 a número romano\n");

        System.out.print("Ingresa un número ? ");
        int num = new Scanner(System.in).nextInt();

        switch (num) {
            case 1 : System.out.print("\nI"); break;
            case 2 : System.out.print("\nII"); break;
            case 3 : System.out.print("\nIII"); break;
            case 4 : System.out.print("\nIV"); break;
            case 5 : System.out.print("\nV"); break;
            case 6 : System.out.print("\nVI"); break;
            case 7 : System.out.print("\nVII"); break;
            case 8 : System.out.print("\nVIII"); break;
            case 9 : System.out.print("\nIX"); break;
            case 10 : System.out.print("\nX"); break;
            default :System.out.print("\nLo siento, ese número está fuera de rango");
        }
        System.out.print("\n");
        System.out.print("\nProceso terminado...");
    }
}
