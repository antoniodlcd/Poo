// Muestra un mensaje según la calificación obtenida

import java.util.Scanner;

public class _p37_CalculoNotas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        float cal1,cal2,cal3,cal4,cal5,promedio;
        Scanner obj = new Scanner(System.in);

        System.out.print("Muestra un mensaje según la calificación obtenida\n");

        System.out.print("\nFavor de ingresar las 5 calificaciones obtenidas\n");
        System.out.print("Primera calificación > "); cal1 = obj.nextFloat();
        System.out.print("Segunda calificación > "); cal2 = obj.nextFloat();
        System.out.print("Tercera calificación > "); cal3 = obj.nextFloat();
        System.out.print("Cuarta calificación  > "); cal4 = obj.nextFloat();
        System.out.print("Quinta calificación  > "); cal5 = obj.nextFloat();

        promedio = (cal1 + cal2 + cal3 + cal4 + cal5) / 5;

        if (promedio >= 0 && promedio <= 6) {
            System.out.print("\nQuedas reprobado.");
        } else if (promedio >= 6 && promedio <= 7) {
            System.out.print("\nPanzaste !!!");
        } else if (promedio >= 7 && promedio <= 8) {
            System.out.print("\nMuy bien, pero puedes hacerlo mejor");
        } else if (promedio >= 8 && promedio <= 9) {
            System.out.print("\nExcelente, sigue así");
        } else if (promedio >= 9 && promedio <= 10) {
            System.out.print("\nPerfecto, tu esfuerzo valió la pena");
        } else
            System.out.print("\nEso no es posible...");

    }
}
