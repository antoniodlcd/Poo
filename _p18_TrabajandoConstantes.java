// Trabajando con constantes
public class _p18_TrabajandoConstantes {
    static final double DESCUENTO = 0.10;
    static final int VELOCIDADLUZ = 30000;
    static final float TASA = 0.5f;
    static final byte SEPARADOR = 113;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("La constantes son:\n");
        System.out.printf("descuento x 2 : %.2f \n", 2 * DESCUENTO);
        System.out.printf("velocidad / 2 : %d \n", VELOCIDADLUZ / 2);
        System.out.printf("tasa : %.2f \n", TASA);
        System.out.printf("separador : %d \n", SEPARADOR);
        // VELOCIDADLUZ = 0; // NO SE PUEDE modificar el valor de una constante
        
    }
}