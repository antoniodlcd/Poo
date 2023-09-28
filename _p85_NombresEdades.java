// Lee un arreglo de n nombres y edades, calcula el promedio de edades

import java.util.Scanner;

public class _p85_NombresEdades {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int n = 0, s = 0;
        Float p = 0f;
        Scanner obj = new Scanner(System.in);

        System.out.print("Cuántos nombres deseas procesar? > "); n = obj.nextInt();
        String[] nombres = new String[n];
        Integer[] edades = new Integer[n];

        System.out.printf("Dame los %d nombres: \n",n);
        for (int i = 0; i < nombres.length; i++) {
            obj.nextLine();
            System.out.printf("Ingresa el nombre %d > ", i+1); nombres[i] = obj.nextLine();
            System.out.printf("Ingresa la edad   %d > ", i+1); edades[i] = obj.nextInt();
        }

        System.out.println("\nLos nombres capturados son:\n");
        System.out.print("Nombre\t\tEdad\n");
        System.out.println("----------------------");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%s\t\t%d\n", nombres[i], edades[i]);
            s += edades[i];
        }
        p = (float) s / n;

        System.out.printf("\nEl promedio de edades es %.2f ", p);
        System.out.println("\n\nProceso terminado...");

        obj.close();
    }
}
