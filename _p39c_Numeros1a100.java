// Imprime los números del 1 al número y con el paso que el usuario elija

import java.util.Scanner;

public class _p39c_Numeros1a100 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int count = 1, num, paso = 1;
        Scanner obj = new Scanner(System.in);

        System.out.print("Imprime los números del 1 al número y con el paso que el usuario elija\n");

        System.out.print("Hasta qué número? > "); num = obj.nextInt();
        System.out.print("Con qué paso? > "); paso = obj.nextInt();

        if ((num >= 1) && (paso > 0)) {
            while (count <= num) {
                System.out.print(count + " ");
                count += paso;
            }
        } else {
            System.out.print("\n¡Error!, debe ingresar números positivos...");
        }
        System.out.print("\nProceso terminado...");
    }
}
