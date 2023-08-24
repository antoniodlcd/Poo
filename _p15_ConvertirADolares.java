// Calcula el valor equivalente de pesos a dólares

import java.util.Scanner;

public class _p15_ConvertirADolares {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        double valor_dolar, dolar, peso;

        valor_dolar = 16.81;

        System.out.print("Ingresa la cantidad en pesos ? ");
        peso = new Scanner(System.in).nextDouble();

        dolar = peso / valor_dolar;

        System.out.printf("Sabiendo que se cotizan $%.2f pesos por dolar, se sabe que \n$%.2f peso(s) eqivalen a: \n$%.2f dolar(es)", valor_dolar, peso, dolar);
    }
}
