// Muestra los números impares de manera descendente desde 100 hasta el número que el usuario elija

import java.util.Scanner;

public class _p49_ParesDescendente {
    public static void main(String[] args) {
        int num, count, count_2, suma;
        float prom;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Muestra los n\u00FAmeros impares de manera descendente desde 100 hasta el n\u00FAmero que el usuario elija\n");

            System.out.print("Hasta dónde? > "); num = obj.nextInt();
            count = 100;
            count_2 = 0;
            suma = 0;
            while (count >= num) {
                System.out.printf("%d ", count);
                suma += count;
                count -= 2;
                count_2 ++;
            }
            prom = (float) suma / count_2;
            System.out.printf("\nLa suma     : %d", suma);
            System.out.printf("\nEl promedio : %.2f", prom);

            do {
                System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
            } while (!(resp == 'S' || resp == 'N'));
        } while (resp != 'N');
    }
}