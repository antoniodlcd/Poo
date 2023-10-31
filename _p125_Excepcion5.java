import java.util.Scanner;

public class _p125_Excepcion5 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner obj = new Scanner(System.in);

        int a[] = {10,20,30,40};

        try {

            System.out.print("A qué posición del arreglo quieres acceder? > "); int pos = obj.nextInt();
            System.out.println("La posición " + pos + ", contiene el valor " + a[pos]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Estás accediendo a una posición fuera de los límites del arreglo!!!, no jodas U_U");
        } finally {
            System.out.println("Los elementos del arreglo son:");
            for (int i : a) {
                System.out.print(i + " ");
            }
        }

        obj.close();
    }
}
