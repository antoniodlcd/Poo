// Imprime la secuencia de términos, el número de renglones que el usuario desee y su suma

import java.util.Scanner;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        int suma, num;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Calcula la secuencia de términos, el número de renglones que el usuario desee y su suma:\n");
            System.out.print("Cuántos términos? > "); num = obj.nextInt();

            suma = 0;
            for (int i = 1; i <= num; i ++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(1);
                }
                if (i < num) {
                    System.out.print(" + ");
                } else {
                    suma *= 10;
                    suma += i;
                    System.out.printf("\nLa suma de los términos es = %d", suma);
                }
                suma *= 10;
                suma += i;
                
            }

            do {
                System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
            } while (!(resp == 'S' || resp == 'N'));
        } while (resp != 'N');
    }
}
