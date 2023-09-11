// Permite al usuario elejir entre imprimir números de (1 a n) o de (n a 1)

import java.util.Scanner;

public class _p54_ArribaAbajo {
    public static void main(String[] args) {
        int num, paso, i, resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Permite al usuario elejir entre imprimir números de (1 a n) o de (n a 1)\n");
            System.out.print("[ 1 ] Números de 1 a n \n");
            System.out.print("[ 2 ] Números de n a 1 \n");
            System.out.print("[ 3 ] Salir \n");
            System.out.print("Elije > "); resp = obj.nextInt();

            switch (resp) {
                case 1 : System.out.print("Hasta dónde quieres llegar? > "); num = obj.nextInt();
                    for (i = 1; i <= num; i ++) System.out.printf("%d ",i); break;
                case 2 : System.out.print("Desde dónde quieres empezar? > "); num = obj.nextInt();
                    for (i = num; i >= 1; i --) System.out.printf("%d ",i); break;
                case 3 : System.out.print("\nTe vas porque quieres, adiós..."); break;
                default : System.out.print("\nOpción inválida...");
            }
            System.out.print("\nPresiona <Enter> para continuar .."); obj.nextLine(); obj.nextLine();


        } while (resp != 3);
        System.out.print("\nProceso terminado...");
    }
}
