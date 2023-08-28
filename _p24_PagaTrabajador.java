// Calcula la paga d eun trabajador, las horas extra se pagan al doble

import java.util.Scanner;

public class _p24_PagaTrabajador {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int horas, extr = 0;
        float paga, total;
        Scanner obj = new Scanner(System.in);

        System.out.println("Calcula la paga d eun trabajador, las horas extra se pagan al doble\n");
        System.out.print("Horas trabajadas ? "); horas = obj.nextInt();
        System.out.print("Paga por hora ? "); paga = obj.nextFloat();

        if (horas > 40) {
            extr = horas - 40;
            total = 40 * paga + (2 * paga * extr);
        } else total = horas * paga;


        System.out.printf("\nHoras extra : %d", extr);
        System.out.printf("\nEL pago total es de %.2f",total);

    }
}
