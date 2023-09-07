// Cuenta números positivos, negativos y ceros hasta ingresar 999

import java.util.Scanner;

public class _p43_ConteoNumeros {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int num, suma = 0, count = 0, count_p = 0, count_n = 0, count_0 = 0;
        Scanner obj = new Scanner(System.in);

        System.out.println("Cuenta números positivos, negativos y ceros hasta ingresar 999\n");

        do{
            System.out.print("Ingresa un número entero > "); num = obj.nextInt();
            if (num != 999) {
                count ++;
                suma += num;
                if (num > 0) count_p ++;
                else if (num < 0) count_n ++;
                else if (num == 0) count_0 ++;
            }
        } while (num != 999);

        System.out.printf("\nCantidad de número ingreasados : %d", count);
        System.out.printf("\nSuma total de los números      : %d", suma);
        System.out.printf("\nCantidad de número positivos   : %d", count_p);
        System.out.printf("\nCantidad de número negativos   : %d", count_n);
        System.out.printf("\nCantidad de ceros              : %d\n", count_0);

        System.out.print("\nProceso terminado...");
    }
}
