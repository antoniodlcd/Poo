// Recibe un ángulo y devuelve el tipo de ángulo que es

import java.util.Scanner;

public class _p79_Angulo {

    public static String Angulo (int ang) {
        String nom = "";
        if (ang < 90)                    nom = "Agudo";
        else if (ang == 90)              nom = "Recto";
        else if (ang > 90 && ang < 180)  nom = "Obtuso";
        else if (ang == 180)             nom = "Llano";
        else if (ang > 180 && ang < 360) nom = "Cóncavo";
        else if (ang == 360)             nom = "Completo";

        return nom;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int ang;
        Scanner obj = new Scanner(System.in);

        System.out.print("Recibe un ángulo y devuelve el tipo de ángulo que es\n");
        
        System.out.print("Dame el ángulo > "); ang = obj.nextInt();
        if (ang >= 0 && ang <= 360 ) {
            System.out.printf("El ángulo %d es %s", ang, Angulo(ang));
        } else {
            System.out.println("Error!!! fuera de rango");
        }
        obj.close();
    }
}
