// Dado un número entre 1 y 7, imprime un día de la semana

import java.util.Scanner;

public class _p30_DiaSemana {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        System.out.print("Dado un número entre 1 y 7, imprime un día de la semana\n");
        
        System.out.print("Ingresa el número del día ? ");
        int num = new Scanner(System.in).nextInt();

        switch (num) {
            case 1 : System.out.print("\nLunes"); break;
            case 2 : System.out.print("\nMartes"); break;
            case 3 : System.out.print("\nMiércoles"); break;
            case 4 : System.out.print("\nJueves"); break;
            case 5 : System.out.print("\nViernes"); break;
            case 6 : System.out.print("\nSábado"); break;
            case 7 : System.out.print("\nDomingo"); break;
            default : System.out.print("\nDía inválido, ¿En qué día vives? !!!!"); break;
        }
        System.out.print("\nProceso terminado...");
    }
}