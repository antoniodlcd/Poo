// Calcula e imprime el factorial de un número, usando una función

import java.util.Scanner;

public class _p73_Factorial {

    public static double Factorial (int n) {
        double f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
            
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int n;
        Scanner obj = new Scanner(System.in);

        System.out.print("Calcula e imprime el factorial de un número, usando una función\n");

        System.out.print("Dame un número entero > "); n = obj.nextInt();
    
        System.out.printf("\nEl factorial del número es %f", Factorial(n));

        obj.close();
    }
}
