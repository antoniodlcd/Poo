// Imprime los números del 1 al 100 con usando un ciclo while

public class _p39_Numeros1a100 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int count = 1;

        System.out.println("Imprime los números del 1 al 100 con usando un ciclo while\n");

        while (count <= 100) {
            System.out.print(count + " ");
            count ++;
        }
        System.out.print("\nProceso terminado...");
    }
}