// Calcula el factorial de n número 

import java.util.Scanner;

public class _p59_FactorialNumeros {
    public static void main(String[] args) {
        int num, multi, count;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Calcula el factorial de n número\n");
            System.out.print("Hasta que numero? > "); num = obj.nextInt();

            for (int i = 1; i <= num; i ++) {
                count = multi = 1;
                System.out.printf("%d ! = ", i);
                for (int j = 1; j <= i; j++){
                    System.out.printf("(%d) ", count);
                    multi *= count;
                    count ++;
                }
                System.out.printf("= %d\n", multi);
            }

            do {
                System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
            } while (!(resp == 'S' || resp == 'N'));
        } while (resp != 'N');

    }
}
