// Muestra un continente dependiendo de un número dado

import java.util.Scanner;

public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int num;
        Scanner obj = new Scanner(System.in);

        System.out.print("Muestra un continente dependiendo de un número dado\n");

        System.out.print("\nAsia          [1]");
        System.out.print("\nÁfrica        [2]");
        System.out.print("\nNorte América [3]");
        System.out.print("\nSur América   [4]");
        System.out.print("\nAntártida     [5]");
        System.out.print("\nEuropa        [6]\n");
        
        System.out.print("\nIngresa el número > "); num = obj.nextInt();
        
        switch (num) {
            case 1 : System.out.print("\nAsia\n"); break;
            case 2 : System.out.print("\nÁfrica\n"); break;
            case 3 : System.out.print("\nNorte América\n"); break;
            case 4 : System.out.print("\nSur América\n"); break;
            case 5 : System.out.print("\nAntártida\n"); break;
            case 6 : System.out.print("\nEuropa\n"); break;
            default : System.out.print("\n!Error¡ ...Número fuera de rango"); break;
        }
    }
}
