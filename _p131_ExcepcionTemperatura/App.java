package _p131_ExcepcionTemperatura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    
    public static Float convertirFahrenheit(float celsius) throws TemperaturaExcesiva {
        if (celsius > 100) {
            throw new TemperaturaExcesiva("Temperatura demasiado alta, no se puede convertir");
        }
        float fahrenheit = 0f;
        fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        float celsius = 0f;
        Scanner obj = new Scanner(System.in);

        try {
            System.out.print("Dame una temperatura en centígados > "); celsius = obj.nextFloat();
            System.out.printf("%.2f grados centígrados, equivalen a %.2f grados Fahrenheit", celsius, convertirFahrenheit(celsius));
        } catch(TemperaturaExcesiva e) {
            System.out.println(e);
        } catch(InputMismatchException e){
            System.out.println("La temperatura a convertir, debe ser un valor numérico");
        }

        obj.close();

    }
}
