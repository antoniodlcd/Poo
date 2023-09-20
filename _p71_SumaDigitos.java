// Suma los dígitos individuales de un entero, usando una función

import java.util.Scanner;

public class _p71_SumaDigitos {

    public static int SumaDigitos (int num) {
        int suma = 0, dig = 0;
        while (num != 0) {
            dig = num % 10;
            suma += dig;
            num /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int num = 0;
        Scanner obj = new Scanner(System.in);

        System.out.print("Suma los dígitos individuales de un entero, usando una función\n");

        System.out.print("Dame un número entero > "); num = obj.nextInt();


        System.out.printf("\nLa suma de los dígitos es %d", SumaDigitos(num));
        obj.close();

    }
}
