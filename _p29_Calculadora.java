// Efectua operaciones matemáticas básicas con dos números

import java.util.Scanner;

public class _p29_Calculadora {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        double n1,n2; char op;
        Scanner obj = new Scanner(System.in);

        System.out.println("Efectua operaciones matemáticas básicas con dos números\n");
        System.out.print("Dame el número 1 ? "); n1 = obj.nextDouble();
        System.out.print("Dame el número 2 ? "); n2 = obj.nextDouble();
        System.out.print("Operación (+ - * / ^) ? "); op = obj.next().charAt(0);

        switch (op) {
            case '+':
                System.out.printf("%2f + %2f= %2f",n1,n2, n1 + n2);
                break;
            case '-':
                System.out.printf("%2f - %2f= %2f",n1,n2, n1 - n2);
                break;
            case '*':
                System.out.printf("%2f * %2f= %2f",n1,n2, n1 * n2);
                break;
            case '/':
                System.out.printf("%2f / %2f= %2f",n1,n2, n1 / n2);
                break;
            case '^':
                System.out.printf("%2f ^ %2f= %2f",n1,n2, Math.pow(n1, n2));
                break;
        }
        System.out.println("\nProceso terminado...");
    }
}
