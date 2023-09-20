// Suma pares o impares en un rango de valores, usando una función

import java.util.Scanner;

public class _p72_SumaParesImpares {

    public static int SumaPares (int suma, int ini, int fin, char pi) {
        for (int i = ini; i <= fin; i ++){
            if (i%2 == 0 && pi == 'P'){
                System.out.printf("%d ", i);
                suma += i;
            } else if (i%2 != 0 && pi == 'I') {
                System.out.printf("%d ", i);
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int ini = 0, fin = 0, suma = 0;
        char pi = ' ';
        Scanner obj = new Scanner(System.in);

        System.out.print("Suma pares o impares en un rango de valores, usando una función\n");

        do {
            System.out.print("Dame el valor inicial > "); ini = obj.nextInt();
            System.out.print("Dame el valor final   > "); fin = obj.nextInt();
        } while (ini > fin);

        do {
            System.out.print("[P]ares o [I]mpares > "); pi = Character.toUpperCase(obj.next().charAt(0));
        } while (pi != 'P' && pi != 'I');

        suma = SumaPares(suma, ini, fin, pi);
        System.out.printf("\nLa suma es : %d", suma);
        obj.close();
    }
}
