// Verifica cúal es el mayor de 3 números dados

import java.util.Scanner;

public class _p34_NumeroMayor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int num1,num2,num3;
        Scanner obj = new Scanner(System.in);

        System.out.print("Verifica cúal es el mayor de 3 números dados\n");

        System.out.print("Ingresa el primer número  > "); num1 = obj.nextInt();
        System.out.print("Ingresa el segundo número > "); num2 = obj.nextInt();
        System.out.print("Ingresa el tercer número  > "); num3 = obj.nextInt();

        if (num1 == num2 && num1 == num3){
            System.out.print("\nLos 3 números son iguales");
        } else if (num1 > num2 && num1 > num3) {
            System.out.printf("\nEl número [%d] es el mayor de los 3",num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("\nEl número [%d] es el mayor de los 3",num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.printf("\nEl número [%d] es el mayor de los 3",num3);
        } else if ((num1 == num2 || num1 == num3) && !(num1 == num2 && num1== num3)) {
            System.out.printf("\nLos números [%d] y [%d] son los mayores",num1, num1);
        } else if (num2 == num1 || num2 == num3 && !(num1 == num2 && num1== num3)) {
            System.out.printf("\nLos números [%d] y [%d] son los mayores",num2, num2);
        } else if (num3 == num1 || num3 == num1 && !(num1 == num2 && num1== num3)) {
            System.out.printf("\nLos números [%d] y [%d] son los mayores",num3, num3);
        } 
    }
}
