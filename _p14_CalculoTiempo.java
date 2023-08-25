// Dada una cantidad  en horas, calcula su equivalente en días, minutos y segundos

import java.util.Scanner;

public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int hor,min,seg;
        double dia;

        System.out.print("Ingresa la cantidad de horas ? ");
        hor = new Scanner(System.in).nextInt();

        dia = hor / 24.00;
        min = hor * 60;
        seg = hor * 3600;

        System.out.printf("%d hora(s) equivalen a: \n%.2f días \n%d minutos y \n%d segundos", hor, dia, min, seg);
    }
}
