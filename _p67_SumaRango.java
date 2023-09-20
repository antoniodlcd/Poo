// Suma de un rango de números

import java.util.Scanner;

public class _p67_SumaRango {
    
    public static int SumaRango(int ini, int fin) {
        int suma = 0;
        for (int i = ini; i <= fin; i++){
            suma += i;
        }
        return suma;
    }
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int ini, fin;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("Suma de un rango de números\n");
            System.out.print("Dame el inicio > "); ini = obj.nextInt();
            System.out.print("Dame el final  > "); fin = obj.nextInt();

            if (ini < fin)
                System.out.print("\n¡¡Error!!");

        } while (ini > fin);

        System.out.printf("La suma de %d a %d es : %d", ini, fin, SumaRango(ini, fin));
        obj.close();
    }
}
