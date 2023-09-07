// Muestra la tabla de multiplicar que el usuario elija y hasta el número que el usuario elija

import java.util.Scanner;

public class _p42b_TablaMultiplicar {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int tabla, count = 1, num;
        Scanner obj = new Scanner(System.in);

        System.out.print("Muestra la tabla de multiplicar que el usuario elija y hasta el número que el usuario elija\n");

        System.out.print("Qué tabla desea?  > "); tabla = obj.nextInt();
        System.out.print("Hasta qué número? > "); num = obj.nextInt();

        while (count <= num) {
            System.out.printf("\n%d  x  %d  =  %d", tabla, count, tabla * count);
            count ++;
        }
    }
}
