import java.util.InputMismatchException;
import java.util.Scanner;

public class _p124_Excepcion4 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        try {

            Scanner obj = new Scanner(System.in);
            System.out.print("Dame el numerador   > "); int a = obj.nextInt();
            System.out.print("Dame el denominador > "); int b = obj.nextInt();
            
            int c = a / b;
            System.out.println("El resultado es     : " + c);

            obj.close();
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Ámbos valores deben ser numéricos");
            System.out.println("Mensaje del sistema : " + e);
            
        } finally {
            System.out.println("Hemos terminado! Si no la regaste, felicidades, y si la regaste, ponte abuzado");
        }
    }
}
