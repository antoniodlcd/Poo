// Verifica si 3 números enteros dados son consecutivos

import java.util.Scanner;

public class _p33_NumerosConsecutivos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int num1,num2,num3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Verifica si 3 números enteros dados son consecutivos\n");

        System.out.print("Ingresa el primer número  > "); num1 = obj.nextInt();
        System.out.print("Ingresa el segundo número > "); num2 = obj.nextInt();
        System.out.print("Ingresa el tercer número  > "); num3 = obj.nextInt();
        

        if (num2 == num1 + 1 && num3 == num2 + 1) {
            System.out.printf("\nLos numeros (%d, %d, %d) son consecutivos", num1, num2, num3);
        } else if (num2 == num1 - 1 && num3 == num2 - 1) {
            System.out.printf("\nLos numeros (%d, %d, %d) son consecutivos", num1, num2, num3);
        } else {
            System.out.printf("\nLos numeros (%d, %d, %d) no son consecutivos", num1, num2, num3);
        }

    }
}