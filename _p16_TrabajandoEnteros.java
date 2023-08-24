// Trabajando con enteros

public class _p16_TrabajandoEnteros {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        int num1 = 150;
        int num2 = 0x2A;
        int num3 = 0b00101010;
        
        byte val1 = 120, val2 = 1;
        short horas = 24, dias = 9099;
        long ganancia = 9223372036854733207l;

        System.out.println("\nUso de String.format para formateo de números enteros: \n");
        System.out.println(String.format("num1 en base decimal : %d", num1));
        System.out.println(String.format("num1 en base octal   : %o", num1));
        System.out.println(String.format("num1 en base hexa    : %x", num1));
        System.out.println(String.format("La ganancia con comas   : %,d", ganancia));
        
        System.out.println("\nUso de String.format para formateo de números enteros: \n");
        System.out.println("num2 en formato diez : " + Integer.toString(num2));
        System.out.println("num2 en formato octal : " + Integer.toString(num2,8));
        System.out.println("num2 en formato hexa : " + Integer.toString(num2,16));

        System.out.println("\nUso de String.format para formateo de números enteros: \n");
        System.out.printf("val1 y val2 en formato decimal  :   %d  %d \n", val1, val2);
        System.out.printf("val1 y val2 en formato octal    :   %o  %o \n", val1, val2);
        System.out.printf("val1 y val2 en formato hexa     :   %x  %x \n", val1, val2);

        System.out.println("\nUso de MIN_VALUE y MAX_VALUE para mostrar los rangos\n");
        System.out.println(String.format("\nTipoo byte: Min: %d Max: %d", Byte.MIN_VALUE, Byte.MAX_VALUE));
        System.out.println(String.format("\nTipoo short: Min: %d Max: %d", Short.MIN_VALUE, Short.MAX_VALUE));
        System.out.println(String.format("\nTipoo int: Min: %d Max: %d", Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(String.format("\nTipoo long: Min: %d Max: %d", Long.MIN_VALUE, Long.MAX_VALUE));

    }
}