// Muestra los números impares de manera ascendente desde 1 hasta el número que el usuario elija

import java.util.Scanner;

public class _p48_ImparesAscendente {
    public static void main(String[] args) {
        int num, count, count_2, suma;
        float prom;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Muestra los números impares de manera ascendente desde 1 hasta el número que el usuario elija\n");

            System.out.print("Hasta dónde? > "); num = obj.nextInt();
            count = 1;
            count_2 = 0;
            suma = 0;
            while (count <= num) {
                count_2 ++;
                suma += count;
                System.out.printf("%d ", count);
                count += 2;
                
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
