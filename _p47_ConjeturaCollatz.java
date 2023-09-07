// Imprime los números generados por la conjetura de Collatz

import java.util.Scanner;

public class _p47_ConjeturaCollatz {
    public static void main(String[] args) {
        char resp;
        int n;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Imprime los números generados por la conjetura de Collatz");
            
            do {
                System.out.print("Dame un número positivo > "); n = obj.nextInt();
            } while(n <= 1);
            do {
                System.out.printf("%d ", n);
                if (n%2 == 0)
                    n /= 2;
                else
                    n = (n * 3) + 1;
            } while (n != 1);
            System.out.printf("%d ", n);
            System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa!");
    }
}
