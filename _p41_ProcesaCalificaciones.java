// Procesa las n número de calificaciones dadas por el usuario

import java.util.Scanner;

public class _p41_ProcesaCalificaciones {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int n, count = 0;
        float cal, suma = 0, prom;
        Scanner obj = new Scanner(System.in);

        System.out.print("Procesa las n número de calificaciones dadas por el usuario\n");

        System.out.print("Cuántas calificaciones ingresará? > "); n = obj.nextInt();
        
        do {
            System.out.printf("Ingresa la %d° calificación > ", count+1); cal = obj.nextFloat();
            suma += cal;
            count ++;
        } while (count < n);

        prom = suma/n;
        if (prom >= 0) {
            System.out.printf("El promedio de la(s) %d calificación(es) es: %.2f", n, prom);
        } else {
            System.out.print("Por favor, ingrese valores reales...");
        }
        System.out.print("\nProceso terminado...");
    }
}
