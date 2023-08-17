// Calcular la paga de un trabajador

import java.util.Scanner;

public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga,tasa, impuesto, paga_bruta, paga_neta;
        Scanner obj = new Scanner(System.in);

        System.out.print("Nombre del trabajador ? "); nombre = obj.nextLine();
        System.out.print("Horas Trabajadas  ? "); horas = obj.nextInt();
        System.out.print("Paga x Hora? "); paga = obj.nextFloat();
        tasa = 0.03;
        
        paga_bruta = horas * paga;
        impuesto = paga_bruta * tasa;
        paga_neta = paga_bruta - impuesto;

        System.out.println("\nResumen de pagos\n");
        System.out.println(String.format("el trabajador %s, trabajo %d horas, a una paga de %.2f pesos la hora, con una tasa de impuesto de %.2f", nombre,horas,paga,tasa));
        System.out.println(String.format("Paga Bruta        = %.2f", paga_bruta));
        System.out.println(String.format("Impuestos        = %.2f", impuesto));
        System.out.println(String.format("Paga neta        = %.2f", paga_neta));

    }
}
