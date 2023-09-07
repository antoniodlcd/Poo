// Muestra la tabla de multiplicar que pida el usuario

import java.util.Scanner;

public class _p42_TablaMultiplicar {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int tabla, count = 1;
        Scanner obj = new Scanner(System.in);

        System.out.print("Muestra la tabla de multiplicar que pida el usuario\n");

        System.out.print("Qué tabla desea? > "); tabla = obj.nextInt();
        while (count <= 10) {
            System.out.printf("\n%d  x  %d  =  %d", tabla, count, tabla * count);
            count ++;
        }
        System.out.print("\nProceso terminado...");
    }
}
