// Imprime la secuencia de términos armónicos el número de renglones que el usuario desee y su suma

import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        int num;
        float div, suma;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Imprime la secuencia de términos armónicos el número de renglones que el usuario desee y su suma\n");
            System.out.print("Cuántos números? > "); num = obj.nextInt();
            suma = 0;
            for (int i = 1; i <= num; i++) {
                System.out.printf(" 1/%d ", i);
                div = (float) 1/i;
                suma += div;
                if (i < num) {
                    System.out.print(" + ");
                } else 
                    System.out.printf(" = %f", suma);
            }

            do {
                System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
            } while (!(resp == 'S' || resp == 'N'));
        } while (resp != 'N');
    }
}
