// Permite al usuario crear un arreglo de n elementos, muestra su valor máximo y su valor mínimo

import java.util.Scanner;

public class _p91_MayoresPromedio {

    public static int Mayor(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > m) m = a[i];
        }
        return m;
    }
    public static int Menor(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < m) m = a[i];
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int num = 0;
        Scanner obj = new Scanner(System.in);
// 
        System.out.print("Cuántos elementos desea ingresar? > "); num = obj.nextInt();
        int[] arr1 = new int[num];
        for (int i = 0; i <= num - 1; i++) {
            System.out.printf("Ingresa elemento número %d > ", i + 1);
            arr1[i] = obj.nextInt();
        }

        for (int j = 0; j <= arr1.length - 1;j++) {
            System.out.print(arr1[j] + " ");
        }
        System.out.println();
        System.out.printf("El número mayor es : " + Mayor(arr1) );
        System.out.printf("El número menor es : " + Menor(arr1) );

        obj.close();
    }
}
