// Muestra la suma de los múltiplos de 3 o 4 de un rango que elija el usuario

import java.util.Scanner;

public class _p78_SumaMultiplos {

    public static int Suma3 (int ini, int fin) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i%3 == 0) {
                suma += i;
            }
        }
        return suma;
    }
    public static int Suma4 (int ini, int fin) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % 4 == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int ini = 0, fin = 0, multiplo = 0;
        Scanner obj = new Scanner(System.in);

        System.out.print("Muestra la suma de los múltiplos de 3 o 4 de un rango que elija el usuario\n");

        System.out.print("Ingresa el valor inicial    > "); ini = obj.nextInt();
        System.out.print("Ingresa el valor final      > "); fin = obj.nextInt();
        System.out.print("Ingresa el múltiplo (3 o 4) > "); multiplo = obj.nextInt();

        if (ini < fin) {
            switch (multiplo) {
                case 3 :
                    System.out.printf("La suma de los múltiplos de 3 entre %d y %d es : %d", ini, fin, Suma3(ini, fin));
                    break;
                case 4 :
                    System.out.printf("La suma de los múltiplos de 4 entre %d y %d es : %d", ini, fin, Suma4(ini, fin));
                    break;
                default : System.out.print("\nOpción inválida...");
                
            }
        } else {
            System.out.print("\nRango inválido...");
        }
        obj.close();
    }
}
