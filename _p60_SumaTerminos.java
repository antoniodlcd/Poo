// Calcula la suma de n terminos factorial

import java.util.Scanner;

public class _p60_SumaTerminos {
    public static void main(String[] args) {
        int num, multi, count;
        float result = 1, fac = 0, suma;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Calcula la suma de n terminos factoriales\n");
            System.out.print("Hasta que numero? > "); num = obj.nextInt();

            for (int i = 1; i <= num; i ++) {
                count = multi = 1;
                suma = 0;
                
                for (int j = 1; j <= i; j++){
                    multi *= count;
                    fac =(float) 1/multi;
                    count ++;
                    suma += fac;
                }
                
                System.out.printf("1/%d!", i);
                if (i < num)
                    System.out.print(" + ");
                else
                    System.out.printf(" = %.5f", suma);
            }

            do {
                System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
            } while (!(resp == 'S' || resp == 'N'));
        } while (resp != 'N');
    }
}
