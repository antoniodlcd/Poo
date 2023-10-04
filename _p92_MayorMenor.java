import java.util.Scanner;
public class _p92_MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a capturar: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        // Capturar los numeros en el arreglo 

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        // Muestro los elementos 

        System.out.println("Elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        // Encontramos el numero mayor

        int numeroMayor = numeros[0];
        for (int i = 1; i < n; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + numeroMayor);

        int numeroMenor = numeros[0];
        for (int i = 1; i < n; i++) {
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }
        System.out.println("El número menor es: " + numeroMenor);

        scanner.close();

    }
}
