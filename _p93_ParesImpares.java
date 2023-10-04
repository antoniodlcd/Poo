// Realiza 2 arreglos de números aleatorios, identifica y suma los números pares e impares

import java.util.Random;

public class _p93_ParesImpares {

    public static void RellenarArreglo (int[] a) {
        int may = 20, men = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            Random rmd = new Random();
            a[i] = Math.abs(rmd.nextInt(may - men) + men);
        }
    }

    public static void Mostrar(int[] a){
        System.out.print("Elementos del arreglo");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    public static void MostrarPares(int[] a){
        System.out.print("Números pares del arreglo\n");
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0)
                System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    public static void MostrarImpares(int[] a){
        System.out.print("Números impares del arreglo\n");
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 != 0)
                System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int MAX = 100;
        int[] a = new int[MAX];
        int[] b = new int[MAX];
        
        RellenarArreglo(a);
        Mostrar(a);
        System.out.println();
        MostrarPares(a);
        System.out.println();
        MostrarImpares(a);

    }
}