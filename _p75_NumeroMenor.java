// Evalúa 4 números e indica el menor, usando una función

import java.util.Scanner;

public class _p75_NumeroMenor {

    public static int NumeroMenor (int n1,int n2,int n3,int n4) {
        int men = 0;
        if (n1 < n2 && n1 < n3 && n1 < n4) men = n1;
        else if (n2 < n1 && n2 < n3 && n2 < n4) men = n2;
        else if (n3 < n1 && n3 < n2 && n3 < n4) men = n3;
        else if (n4 < n1 && n4 < n2 && n4 < n3) men = n4;
        return men;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int n1, n2, n3, n4, men;
        Scanner obj = new Scanner(System.in);

        System.out.print("Evalúa 4 números e indica el menor, usando una función\n");

        System.out.print("Ingresa los 4 números seguidos: \n");
        n1 = obj.nextInt(); n2 = obj.nextInt(); n3 = obj.nextInt(); n4 = obj.nextInt();

        men = NumeroMenor(n1, n2, n3, n4);
        System.out.printf("El menor de los números es el : %d", men);

        obj.close();
    }
}
