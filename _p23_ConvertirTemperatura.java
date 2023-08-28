// Convierte una temperatura de centígrados a fahrenheit y viceversa

import java.util.Scanner;

public class _p23_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        char op;
        float temp, res;
        Scanner obj = new Scanner(System.in);

        System.out.print("Convierte una temperatura de centígrados a fahrenheit y viceversa");
        System.out.println("[F]  ahrenheit a Celsius");
        System.out.println("[C]  elsius a fahrenheit");
        System.out.println("Elige una opción");
        op = Character.toUpperCase(obj.next().charAt(0));

        if (op == 'F') {
            System.out.println("Dame la temperatura en Fahrenheit ? ");
            temp = obj.nextFloat();
            res = (temp - 32) * 5 / 9;
            System.out.printf("\n%f grados fahrenheit equivale a %f grados centígrados", temp, res);
        } else if (op == 'C') {
            System.out.println("Dame la temperatura en Centrígrados ? ");
            temp = obj.nextFloat();
            res = (temp * 9 / 5) + 32;
            System.out.printf("\n%f grados centígrados equivale a %f grados fahrenheit", temp, res);
        } else
            System.out.println("Opción inválida ");

        System.out.println("\nGracias por utilizar este programa :)");

    }

}
