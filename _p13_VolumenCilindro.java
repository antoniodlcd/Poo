// Calcula el volumen de un cilindro dado su radio y altura

import java.util.Scanner;

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        double vol,rad,alt;

        System.out.print("Ingresa el radio ? ");
        rad = new Scanner(System.in).nextDouble();
        System.out.print("Ingresa la altura ? ");
        alt = new Scanner(System.in).nextDouble();

        vol = (Math.PI) * (Math.pow(rad,2.00)) * (alt);

        System.out.printf("\nDados los siguientes datos: \nRadio: %.2f \nAltura: %.2f \nSe sabe que el volumen de un cilindro es igual a %.2f", rad, alt, vol);
    }
}
