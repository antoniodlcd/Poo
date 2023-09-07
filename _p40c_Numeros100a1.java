// Imprime los números descendentemente del 100 al número y con el paso que el usuario elija

import java.util.Scanner;

public class _p40c_Numeros100a1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int count = 100, num, paso = 1;
        Scanner obj = new Scanner(System.in);

        System.out.print("Imprime los número descendentemente del 100 al número y con el paso que el ususario elija\n");

        System.out.print("Hasta qué número? > "); num = obj.nextInt();
        System.out.print("Con qué paso? (positivo) > "); paso = obj.nextInt();

        if ((num <= 100) && (paso > 0)) {
            while (count >= num) {
                System.out.print(count + " ");
                count -= paso;
            }
        } else {
            System.out.print("\n¡Error!, debe ingresar números menores que 100...");
        }
        System.out.print("\nProceso terminado...");
    }
}
