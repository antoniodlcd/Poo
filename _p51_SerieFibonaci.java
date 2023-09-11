// Muestra los primeros n números de la serie de fibonacci

import java.util.Scanner;

public class _p51_SerieFibonaci {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3 = 0, count = 0, n;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Muestra los primeros n números de la serie de Fibonacci\n");

            System.out.print("Ingresa el valor máximo > "); n = obj.nextInt();
            
            while (count < n) {
                count ++;
                System.out.printf("%d ", num3);
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }

            do {
                System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
            } while (!(resp == 'S' || resp == 'N'));

        } while (resp != 'N');

    }
}
