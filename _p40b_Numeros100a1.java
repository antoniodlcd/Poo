// Imprime los números descendentemente del 100 al número que el usuario elija

import java.util.Scanner;

public class _p40b_Numeros100a1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int count = 100, num;
        Scanner obj = new Scanner(System.in);

        System.out.print("Imprime los números descendentemente del 100 al número que el usuario elija\n");
        System.out.print("Hasta qué número? > "); num = obj.nextInt();

        if (num <= 100) {
            while (count >= num) {
                System.out.print(count + " ");
                count --;
            }
        } else {
            System.out.print("\n¡Error!, el número tiene que ser menor que 100");
        }
        System.out.print("\nProceso terminado...");
    }
}
