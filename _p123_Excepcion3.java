import java.util.InputMismatchException;
import java.util.Scanner;

public class _p123_Excepcion3 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        try {

            Scanner obj = new Scanner(System.in);
            System.out.print("Dame el numerador   > "); int a = obj.nextInt();
            System.out.print("Dame el denominador > "); int b = obj.nextInt();
            
            int c = a / b;
            System.out.println("El resultado es     : " + c);
            obj.close();
        } catch (InputMismatchException e) {
            System.out.println("Ámbos valores deben ser numéricos");
        } catch (ArithmeticException e) {
            System.out.println("El denominador no puede ser 0");
        } finally {
            System.out.println("Hemos terminado! Si no la regaste, felicidades, y si la regaste, ponte abuzado");
        }
    }
}
