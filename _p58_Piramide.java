// Imprime una pirámide de **

import java.util.Scanner;

public class _p58_Piramide {
    public static void main(String[] args) {
        int n = 1, i;
        char car, resp;
        Scanner obj = new Scanner(System.in);

        
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Cuántos renglones? > "); n = obj.nextInt();
            System.out.print("De qué caracter?   > "); car = obj.next().charAt(0);
            for (i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(car);
                }
                System.out.println();
            }

            do {
                System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
            } while (!(resp == 'S' || resp == 'N'));
        } while (resp != 'N');
    }   
}
