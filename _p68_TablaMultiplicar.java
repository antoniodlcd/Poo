// Imprime la tabla que el usuario pide, hasta que lo indique

import java.util.Scanner;

public class _p68_TablaMultiplicar {

    public static void TablaMultiplicar(int tabla, int lim) {
        System.out.printf("\ntabla Tabla del %d", tabla);
        for (int i = 0; i <= lim; i++) {
            System.out.printf("%d x %d = %d\n", tabla, i, tabla * i);
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int tabla, lim;
        Scanner obj = new Scanner(System.in);

        System.out.print("Imprime la tabla que el usuario pide, hasta que lo indique\n");
        System.out.print("Qué tabla quieres?      > "); tabla = obj.nextInt();
        System.out.print("Hasta dónde la quieres? > "); lim = obj.nextInt();

        TablaMultiplicar(tabla, lim);

        TablaMultiplicar(5,8);
        TablaMultiplicar(8,10);
        TablaMultiplicar(20,5);

        
    }
}
