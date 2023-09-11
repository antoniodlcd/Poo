// Calcula la suma y el primedio de n calificaciones

import java.util.Scanner;

public class _p56_SumaPromedio {
    public static void main(String[] args) {
        int n;
        float cal, suma, prom;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");
            suma = prom = 0;

            System.out.print("Calcula la suma y el primedio de n calificaciones\n");
            System.out.print("Cuántas calificaciones deseas procesar? > "); n = obj.nextInt();
            for(int i = 1; i <= n; i++) {
                System.out.printf("Calificación %d > ", i);
                cal = obj.nextFloat();
                suma += cal;
            }
            prom = suma / n;
            System.out.printf("\nLa suma es %.2f y el promedio es %.2f", suma, prom);

            do {
                System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
            } while (!(resp == 'S' || resp == 'N'));
        } while (resp != 'N');
    }
}
