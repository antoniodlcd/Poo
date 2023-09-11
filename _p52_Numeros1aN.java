// Imrpime los números de 1 a n con un ciclo for

import java.util.Scanner;

public class _p52_Numeros1aN {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int num, i, paso;
        Scanner obj = new Scanner(System.in);

        System.out.print("Imrpime los números de 1 a n con un ciclo for\n");

        System.out.print("Hasta qué número? > "); num = obj.nextInt();
        System.out.print("Con qué paso?     > "); paso = obj.nextInt();

        for (i = 1; i <= num; i += paso) {
            System.out.printf("%d ", i);
        }
        System.out.print("\nProceso terminado...");
    }
}