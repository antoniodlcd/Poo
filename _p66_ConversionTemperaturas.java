// Conversión de temperaturas usando funciones

import java.util.Scanner;

public class _p66_ConversionTemperaturas {

    public static float Fahrenheit(float temp) {
        float result;
        result = (temp * 9/5) + 32;
        return result;
    }

    public static float Celcius(float temp) {
        float result;
        result = (temp - 32) * 5/9;
        return result;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int op;
        float temp = 0, res = 0;
        Scanner obj = new Scanner(System.in);

        System.out.print("Conversión de temperaturas usando funciones\n");
        System.out.print("\n[1] Fahrenheit\n[2] Celcius\nElige > "); op = obj.nextInt();
        switch (op) {
            case 1:
                System.out.print("Convertir a Fahrenheit\nDame la temperatura > "); temp = obj.nextFloat();
                res = Fahrenheit(temp);
                System.out.printf("La temperatura : %.2f en grados Celcius \nEquivale a     : %.2f grados Fahrenheit", temp, res);
                break;
            case 2:
                System.out.print("Convertir a Centígrados\nDame la temperatura > "); temp = obj.nextFloat();
                res = Celcius(temp);
                System.out.printf("La temperatura : %.2f en grados Fahrenheit \nEquivale a     : %.2f grados Celcius", temp, res);
                break;
            default : System.out.print("\nOpción inválida...");

            
        }

    }
}
