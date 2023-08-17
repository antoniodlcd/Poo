// Calcula el área de un Círculo

import java.util.Scanner;

public class _p02_AreaCirculo {
    public static void main(String[] args) {
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.println("\nCalculando el area de un círculo\n");
        System.out.println("Dame el radio ? ");
        radio = lradio.nextFloat();

        area = Math.PI * Math.pow(radio,2);

        System.out.println("El círculo de radio " + radio + " tiene un área de " + area);
    }
}