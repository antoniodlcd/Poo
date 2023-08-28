// Verifica si la suma de 3 números es igual a un tercer número

import java.util.Scanner;

public class _p22_VerificarSuma {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int num1, num2, num3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Verifica si la suma de 3 números es igual a un tercer número\n");
        System.out.print("Número 1 ? "); num1 = obj.nextInt();
        System.out.print("Número 2 ? "); num2 = obj.nextInt();
        System.out.print("Número 3 ? "); num3 = obj.nextInt();

        if (num1+num2 == num3)
            System.out.println("Son iguales");
        else
            System.out.println("Son diferentes");
        
        System.out.println("\nGracias por usar este programas");

    }
}
