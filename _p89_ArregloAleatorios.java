// Genera arreglos aleatorios y los suma

import java.util.Random;

public class _p89_ArregloAleatorios {

    public static void Mostrar(float[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%.2f ", a[i]);
        }
        System.out.println();
    }

    public static void GeneraAleatorios (float[] a) {
        float min = 10.5f, max = 41.5f;
        Random rmd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.abs(rmd.nextFloat(max-min) + min);
        }
    }

    public static void SumarArreglos (float[] a, float[] b, float[] c){
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int MAX = 15;
        float[] nums1 = new float[MAX];
        float[] nums2 = new float[MAX];
        float[] nums3 = new float[MAX];
        
        System.out.println("\nPrimer arreglo de números aleatorios");
        GeneraAleatorios(nums1);
        Mostrar(nums1);
        
        System.out.println("\nSegundo arreglo de números aleatorios");
        GeneraAleatorios(nums2);
        Mostrar(nums2);

        System.out.println("\nLa suma de los arreglos es ");
        SumarArreglos(nums1, nums2, nums3);
        Mostrar(nums3);
    }
}
