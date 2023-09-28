// Genera números aleatorios

import java.util.Random;

public class _p88_Aleatorios {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Random rmd = new Random();

        int aleatorio1 = rmd.nextInt();
        int aleatorio2 = rmd.nextInt(30);
        int aleatorio3 = Math.abs(rmd.nextInt(100-50)) + 50;

        System.out.println("Número entero aleatorio positivo          : " + Math.abs(aleatorio1));
        System.out.println("Número entero aleatorio positivo 0 .. 29  : " + Math.abs(aleatorio2));
        System.out.println("Número entero aleatorio positivo 50 .. 99 : " + aleatorio3);
    }
}
