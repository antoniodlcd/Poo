// Administra el pago por estacionamiento de acuerdo a la zona

import java.util.Scanner;

public class _p32_PagoEstacionamiento {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int num; float tasa,pago,impuesto,total; String salida;
        tasa = pago = impuesto = total = 0;
        salida = "";
        Scanner obj = new Scanner(System.in);

        System.out.print("Administra el pago por estacionamiento de acuerdo a la zona\n");

        System.out.println("1 - Estacionamiento Tacuba         3%");
        System.out.println("2 - Estacionamiento Portales       5%");
        System.out.println("3 - Estacionamiento Conquistadores 10%");
        System.out.println("4 - Estacionamiento Pájaros Caídos 15%");

        System.out.print("\nElige una opción ? "); num = obj.nextInt();
        System.out.print("\nPago efectuado ? "); pago = obj.nextFloat();

        switch (num) {
            case 1 : tasa = .03f; break;
            case 2 : tasa = .05f; break;
            case 3 : tasa = .10f; break;
            case 4 : tasa = .15f; break;
            default : System.out.print("\nOpción inválida !!!");
        }
        impuesto = pago * tasa;
        total = pago + impuesto;

        salida = String.format("\nElegiste el estacionamiento : %d \n"+
        "Pago por el tiempo de uso   : $%,.2f \n" +
        "Corresponde un impuesto de  : $%,.2f \n" + 
        "El pago total es de         : $%,.2f", num, pago, impuesto, total);
        System.out.println(salida);

        System.out.print("\nProceso terminado...");
    }
}
