// Evalúa un número del 1 al 7 y muestra el día de la semana que le corresponde, usando una función

import java.util.Scanner;

public class _p76_DiaSemana {

    public static String DiaSemana (int num) {
        String dia = "";
        switch (num) {
            case 1 : dia = "Lunes"; break;
            case 2 : dia = "Martes"; break;
            case 3 : dia = "Miércoles"; break;
            case 4 : dia = "Jueves"; break;
            case 5 : dia = "Viernes"; break;
            case 6 : dia = "Sábado"; break;
            case 7 : dia = "Domingo"; break;
            default : dia = "";
        }
        return dia;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int num = 0;
        String dia;
        Scanner obj = new Scanner(System.in);

        System.out.print("Evalúa un número del 1 al 7 y muestra el día de la semana que le corresponde, usando una función\n");

        System.out.print("Ingresa un número entero (entre 1 y 7) > "); num = obj.nextInt();
        dia = DiaSemana(num);
        if (num <= 7 && num >= 1){
            System.out.printf("El número %d corresponde al día %s", num, dia);
        } else {
            System.out.print("¡¡Error!!, valor fuera de rango");
        }

        obj.close();
    }
}
