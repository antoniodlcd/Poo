// Acepta a un estudiante en base a su edad y calificaciones

import java.util.Scanner;

public class _p27_AceptarEstudiante {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        System.out.println("Acepta a un estudiante en base a su edad y calificaciones\n");
        String nombre; int edad; float c1, c2;

        Scanner obj = new Scanner(System.in);

        System.out.print("Dame tu nombre ? "); nombre = obj.nextLine();
        System.out.print("Dame tu edad ? "); edad = obj.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad, Continuamos...");
            System.out.println("Dame 2 calificaciones separadas por Enter: ");
            c1 = obj.nextFloat();
            c2 = obj.nextFloat();

            if (c1 >= 8 && c2 >= 8)
                System.out.printf("\nBIENVENIDO %s tienes %d años y calificaciones %.2f, %.2f ... ACEPTADO\n", nombre, edad, c1, c2);
            else
                System.out.println("\nSolo aceptamos estudiantes con calificaciones 8 en adelante");
        }
        else
            System.out.println("\nSolo aceptamos estudiantes mayores de edad");
        
        System.out.print("\nProceso terminado...");

    }
}
