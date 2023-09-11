// Imrpime los números de n a 1 con un ciclo for

import java.util.Scanner;

public class _p53_NumerosNa1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int num, i, paso;
        Scanner obj = new Scanner(System.in);

        System.out.print("Imrpime los números de n a 1 con un ciclo for\n");

        System.out.print("Desde qué número? > "); num = obj.nextInt();
        System.out.print("Con qué paso?     > "); paso = obj.nextInt();

        for (i = num; i >= 1; i -= paso) {
            System.out.printf("%d ", i);
        }
        System.out.print("\nProceso terminado...");
    }
}
