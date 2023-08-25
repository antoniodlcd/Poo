//Trabajando con números  lotantes

public class _p17_TrabajandoFlotantes {
 public static void main(String[] args) {
    float num1 = 423.45f;
    float num2 = 123f;
    float num3 = 1.94e-8f;
    double num4 = 12332123.434398d;
    double num5 = .3456d;

    System.out.print("\033[H\033[2J"); System.out.flush();

    System.out.println("\nUso de String.format para formateo de números flotanes");
    System.out.println(String.format("num1 y num2 en formato flotante                : %f    %f", num1, num2));
    System.out.println(String.format("num1 y num2 en formato flotante con decimales  : %.2f    %.2f", num1, num2));
    System.out.println(String.format("num1 en formato flotante alineado              : %10.2f", num1));
    System.out.println(String.format("num2 en formato flotante alineado              : %10.2f", num2));
    System.out.println(String.format("num3 en formato flotante exponencial           : %e", num2));
    System.out.println(String.format("num3 en formato flotante exponencial decimales : %.3e", num2));
    System.out.println(String.format("num4 en formato flotante separador miles       : %,.2f", num4));
    System.out.println(String.format("num5 en formato flotante                       : %f", num5));

    System.out.println("\nUso de System.out.printf para formateo de numeros flotatnes");
    System.out.printf("num2 y num2 en formato flotante                  : %f    %f  \n", num1, num2);
    System.out.printf("num3 y num4 en formato flotante con decimales    : %.2f    %.2f  \n", num3, num4);
    System.out.printf("num4 y num5 en formato flotante exponencial      : %e    %e  \n", num4, num5);
    System.out.printf("num4 y num5 en formato flotante exponencial dec  : %.2e    %.2e  \n", num4, num5);

    System.out.println("\nUso de MIN_VALUE y MAX_VALUE para mostrar los rangos\n");
    System.out.println(String.format("\nTipoo float : Min: %f Max: %f", Float.MIN_VALUE, Float.MAX_VALUE));
    System.out.println(String.format("\nTipoo double: Min: %f Max: %f", Double.MIN_VALUE, Double.MAX_VALUE));

 }   
}
