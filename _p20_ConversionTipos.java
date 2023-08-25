// Conversion entre tipos de datos en Java

public class _p20_ConversionTipos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        // Conversión implícita: de pequeño a grande
        int var1 = 9;
        double var2 = var1; // int a double
        float var3 = 123456.789f;
        double var4 = var3; // float a double

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out. println(String.format("Implícita de int a double   :  %d  %f", var1, var2));
        System.out. println(String.format("Implícita de float a double :  %f  %f", var3, var4));

        // Conversiones explícitas : de grande a pequeño
        long var5 = 1234567890123456L;
        int var6 = (int) var5;
        int var7 = 21448364;

        short var8 = (short) var7;
        System.out.println(String.format("Manual con casting de long a int   :   %d  %d", var5, var6));
        System.out.println(String.format("Manual con casting de int a short  :   %d  %d", var7, var8));

    }
}
