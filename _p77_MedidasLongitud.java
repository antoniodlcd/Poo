// Convierte pulgadas a centímetros y metros a pies

import java.util.Scanner;

public class _p77_MedidasLongitud {

    public static double ConvertirPulgadas (double pul) {
        double cen = 0.0;
        cen = pul * 2.54;
        return cen;
    }

    public static double ConvertirMetros (double met) {
        double pie = 0.0;
        pie = met * 3.281;
        return pie;
    }
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        double pul = 0.0, met = 0.0;
        char resp = ' ';
        Scanner obj = new Scanner(System.in);

        System.out.print("Convierte pulgadas a centímetros y metros a pies\n");

    
        System.out.print("[P]ulgadas a centímetros\n[M]etros a pies");
        System.out.print("\nElije una opción > "); resp = Character.toUpperCase(obj.next().charAt(0));
        switch (resp) {
            case 'P' : 
                System.out.println("PULGADAS A CENTÍMETROS");
                System.out.print("Ingresa la cantidad en pulgadas > "); pul = obj.nextDouble();
                System.out.printf("%.3f pulgadas equivalen a %.3f centímetros", pul, ConvertirPulgadas(pul));
                break;
            case 'M' : 
                System.out.println("METROS A PIES");
                System.out.print("Ingresa la cantidad en metros > "); met = obj.nextDouble();
                System.out.printf("%.3f metros equivalen a %.3f pies", met, ConvertirMetros(met));
                break;
            default : 
                System.out.print("Opción inválida...");
                break;
            
        }
        obj.close();
    }
}
