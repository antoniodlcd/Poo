// Calcula el promedio de 3 números usando una función

import java.util.Scanner;

public class _p65_PromedioNumeros {
    
    public static float promedio(float num1, float num2, float num3) {
        float suma, prom;
        suma = num1 + num2 + num3;
        prom = suma / 3;
        return prom;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        float n1, n2, n3, prom;
        Scanner obj = new Scanner(System.in);

        System.out.print("Calcula el promedio de 3 números usando una función\n");
        System.out.print("Dame el número 1 > "); n1 = obj.nextFloat();
        System.out.print("Dame el número 2 > "); n2 = obj.nextFloat();
        System.out.print("Dame el número 3 > "); n3 = obj.nextFloat();

        prom = promedio(n1, n2, n3);
        System.out.printf("\nEl promedio de los números es      : %.2f", prom);
        System.out.printf("\nEl promedio de 10.5, 20.5 y 30.5 es: %.2f", promedio(10.5f, 20.5f, 30.5f));
        System.out.printf("\nEl promedio es                     : %.2f", promedio(6f, 5.5f, 10.0f));

    }
}
