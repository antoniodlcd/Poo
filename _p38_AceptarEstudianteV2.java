// Acepta a un alumno según su sexo, edad y promedio

import java.util.Scanner;

public class _p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        char sexo; int edad; float cal1, cal2, cal3, promedio;
        Scanner obj = new Scanner(System.in);

        System.out.print("Acepta a un alumno según su sexo, edad y promedio\n");

        System.out.print("\nBienvenid@ a la Universidad Kitty Kat SA !!\n");
        System.out.print(
            "Hombre     [H]\n" +
            "Mujer      [M]");
        System.out.print("\nFavor de indicar su género > "); 
        sexo = Character.toUpperCase(obj.nextLine().charAt(0));
        System.out.print("\nFavor de ingresar su edad > ");
        edad = obj.nextInt();
        System.out.print("\nFavor de ingresar sus 3 calificaciones > \n");
        cal1 = obj.nextFloat();
        cal2 = obj.nextFloat();
        cal3 = obj.nextFloat();

        promedio = (cal1 + cal2 + cal3) / 3;

        if  (edad >= 21 && (promedio >= 8 && promedio <= 9.5)) {
            switch (sexo) {
                case 'M' :
                    System.out.print("\nFelicidades!!! Ha sido aceptada en la Universidad Kitty Kat SA");
                    break;
                default :
                    System.out.print("\nLo sentimos, no ha sido aceptado en la Universidad Kitty Kat SA");
            }   
        } else 
            System.out.print("\nLo sentimos, no ha sido aceptad@ en la Universidad Kitty Kat SA");

    }
}
