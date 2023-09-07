// Imprime los números del 100 al 1 usando un ciclo while

public class _p40_Numeros100a1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int count = 100;

        System.out.print("Imprime los números del 100 al 1 usando un ciclo while\n");

        while(count >= 1){
            System.out.print(count + " ");
            count --;
        }
        System.out.print("\nProceso terminado...");
    }
}
