// Calcular la hipotenusa de un triángulo rectángulo dadas las longitudes de sus lados

import java.util.Scanner;

class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double hipo,lado1,lado2;
        System.out.print("Introduce la longitud del lado 1 ? ");
        lado1 = new Scanner(System.in).nextDouble();
        
        System.out.print("Introduce la longitud del lado 2 ? ");
        lado2 = new Scanner(System.in).nextDouble();

        hipo =  Math.sqrt((lado1 * lado1) + (lado2 * lado2)); 
        
        System.out.printf("\nLa longitud de los lados del triángulo son: \nLado 1: %.2f \nlado 2: %.2f", lado1, lado2);

        System.out.printf("\nLa longitud de la hipotenusa es: %.2f",hipo);

    }
}