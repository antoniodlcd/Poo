public class _p121_Excepcion1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int a = 100;
        int b = 0;

        try {

            int c = a / b;
            
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("No se puede dividir entre cero");
        } finally {
            System.out.println("Aquí llegamos se produzca o no el error");
        }
    }
}