// Imprime la secuencia de números mostrados el número de renglones que el usuario desee

import java.util.Scanner;

public class _p62_SecuenciaNumeros2 {
    public static void main(String[] args) {
        int num;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Imprime la secuencia de números mostrados el número de renglones que el usuario desee\n");
            System.out.print("Hasta que numero? > "); num = obj.nextInt();

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%d ", j);
                }
                System.out.println();
            }

            do {
                System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
            } while (!(resp == 'S' || resp == 'N'));
        } while (resp != 'N');
    }
}