// Imprime números pares e impares y su suma

import java.util.Scanner;

public class _p55_SumaParesImpares {
    public static void main(String[] args) {
        int num, i, resp, suma;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Permite al usuario elejir entre imprimir números de (1 a n) o de (n a 1)\n");
            System.out.print("[ 1 ] Impares ascendente \n");
            System.out.print("[ 2 ] Pares descendente \n");
            System.out.print("[ 3 ] Salir \n");
            System.out.print("Elije > ");
            resp = obj.nextInt();

            suma = num = 0;
            switch (resp) {
                case 1:
                    System.out.print("Hasta dónde quieres llegar? > ");
                    num = obj.nextInt();
                    for (i = 1; i <= num; i += 2) {
                        System.out.printf("%d ", i);
                        suma += i;
                    }
                    System.out.printf("\nLa suma de los números impares es : %d", suma);
                    break;
                case 2:
                    System.out.print("Desde dónde quieres empezar? > ");
                    num = obj.nextInt();
                    num = (num % 2 == 0 ? num : --num);
                    for (i = num; i >= 1; i -= 2) {
                        System.out.printf("%d ", i);
                        suma += i;
                    }
                    System.out.printf("\nLa suma de los números pares es : %d", suma);
                    break;
                case 3:
                    System.out.print("\nTe vas porque quieres, adiós...");
                    break;
                default:
                    System.out.print("\nOpción inválida...");
            }
            System.out.print("\nPresiona <Enter> para continuar ..");
            obj.nextLine();
            obj.nextLine();

        } while (resp != 3);
        System.out.print("\nProceso terminado...");
    }
}
