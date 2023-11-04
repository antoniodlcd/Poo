import java.util.InputMismatchException;
import java.util.Scanner;

public class _p129_ExcepcionDulces {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int kids = 0;
        int dulces = 0;
        Scanner obj = new Scanner(System.in);

        try {
            System.out.print("Número de niños en el vecindario > "); kids = obj.nextInt();
            System.out.print("Cantidad de dulces existentes > "); dulces = obj.nextInt();
            System.out.printf("A cada niño le tocan %d dulces.", dulces/kids);
        } catch (InputMismatchException e) {
            System.out.println("Los niños y los dulces, deben ser cantidades numéricas");
        } catch (ArithmeticException e) {
            System.out.println("Si no hay niños, no puedo repartir dulces");
        }

        obj.close();
    }
}
