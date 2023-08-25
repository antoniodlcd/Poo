// Calcula el 3er ángulo  de un triángulo dados los dos primeros ángulos del mismo

import java.util.Scanner;

public class _p11_CalcularAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        double angulo_1,angulo_2,angulo_3;

        System.out.print("Ingresa el primer ángulo ? ");
        angulo_1 = new Scanner(System.in).nextDouble();
        System.out.print("Ingresa el segundo ángulo ? ");
        angulo_2 = new Scanner(System.in).nextDouble();

        angulo_3 = 180 - (angulo_1 + angulo_2);

        System.out.print("\nLos ángulos del triángulo son los siguientes:\n");
        System.out.printf("Ángulo 1: %.2f° \nÁngulo 2: %.2f° \nÁngulo 3: %.2f°", angulo_1, angulo_2, angulo_3);
        
    }
}
