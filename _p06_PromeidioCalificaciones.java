// Calcula el promedio de 3 calificaciones, calcula también la mayor y la menor

import java.util.Scanner;

public class _p06_PromeidioCalificaciones {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();  // Borrar pantalla de la consola

        float cal1,cal2,cal3,suma,prom,min,max;
        cal1 = cal2 = cal3 = 0;
        Scanner obj = new Scanner(System.in);

        System.out.println("Calculando el promedio de 3 calificaciones, calculado también la mayor y la menor:\n");
        System.out.print("Dame calificación 1: "); cal1 = obj.nextFloat();
        System.out.print("Dame calificación 2: "); cal2 = obj.nextFloat();
        System.out.print("Dame calificación 3: "); cal3 = obj.nextFloat();

        suma = cal1 + cal2 + cal3;
        prom = suma /3;
        min = Math.min(Math.min(cal1,cal2),cal3);
        max = Math.max(Math.max(cal1,cal2),cal3);

        System.out.printf("\nLas calificaciones introducidas son: %.2f, %.2f %.2f\n", cal1,cal2,cal3);
        System.out.printf("Suma     : %.2f\n", suma);
        System.out.printf("Promedio : %.2f\n", prom);
        System.out.printf("El menor : %.2f\n", min);
        System.out.printf("El mayor : %.2f\n", max);
    }
}
