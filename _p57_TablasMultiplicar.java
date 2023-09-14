// Imprime las tablas de multiplicar del 1 a n

import java.util.Scanner;

public class _p57_TablasMultiplicar {
    public static void main(String[] args) {
        int n, m;
        char resp;
        Scanner obj = new Scanner(System.in);
        
        do {
        System.out.print("\033[H\033[2J");System.out.flush();

            System.out.print("Imprime las tablas de multiplicar del 1 a n\n");

            System.out.print("Hasta qué tabla quieres? > "); n = obj.nextInt();
            System.out.print("Hasta dónde la quieres?  > "); m = obj.nextInt();
            for (int i = 1; i <= n; i ++) {
                System.out.printf("\nTabla del %d\n", i);
                for (int j = 1; j <=m; j++) {
                    System.out.printf("%d x %d = %d\n", i, j, i * j);
                }
            }

            do {
                System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
            } while (!(resp == 'S' || resp == 'N'));
        } while (resp != 'N');
        System.out.print("\nProceso terminado...");
    }
}
