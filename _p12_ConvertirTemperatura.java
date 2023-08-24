// Convierte una temperatura de grados fahrenheit a grados celsius

import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        double cel,fah;

        System.out.print("Ingresa los grados en Fahrenheit ? ");
        fah = new Scanner(System.in).nextDouble();
        
        cel = (fah - 32) * (5.0/9.0);
        
        System.out.printf("\n%.2f° Fahrenheit son equivalentes a %.2f° Celsius", fah, cel);

    }
}
