import java.util.Scanner;

public class _p128_ExcepcionRaiz {
    public static void main(String[] args) {
        float num = 0f;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");System.out.flush();

        try {
            System.out.println("Calcula la raíz cuadrada");
            System.out.print("Introduce un número > "); num = obj.nextFloat();
            System.out.println("El resultado es : " + Math.sqrt(num));
        } catch (Exception e) {
            System.out.println("Error no puedo calcular la raíz cuadrada");
        }

        obj.close();
    }
}