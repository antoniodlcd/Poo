import java.util.InputMismatchException;
import java.util.Scanner;

public class _p130_ExcepcionEdades {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int[] edades = new int[5];
        int edad;
        int num = 0;
        // Scanner obj = new Scanner(System.in);

        System.out.println("Captura las edades de 5 pesonas: ");
        do {

            try {
                System.out.printf("Edad persona %d > ", num+1); 
                Scanner obj = new Scanner(System.in);
                edad = obj.nextInt();
                edades[num] = edad;
                num += 1;
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número entero");
            }
        } while (num < 5);

        System.out.println("Captura terminada, las edades son:");
        for (int i = 0 ; i <= edades.length-1 ; i++ ){
            System.out.print(edades[i] + " ");
        }
    }
}
