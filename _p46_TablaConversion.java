// Imprime una tabla de conversión de peso a dolar en un rango de valores

import java.util.Scanner;

public class _p46_TablaConversion {
    public static void main(String[] args) {
        char resp;
        float c, inicio, fin, tc=18.30f, tcl=21.86f;
        Scanner obj = new Scanner(System.in);
        
        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Imprime una tabla de conversión de peso a dolar en un rango de valores");
            
            do {
                
                System.out.print("Inicio : "); inicio = obj.nextFloat();
                System.out.print("Fin    : "); fin = obj.nextFloat();
            } while (fin < inicio);

            c = inicio;
            System.out.println("Peso\tDolar\tLibra");
            while (c <= fin) {
                System.out.printf("%.2f\t%.2f\t%.2f \n", c, c/tc, c/tcl);
                c++;
            }
            System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa");
    }
}
