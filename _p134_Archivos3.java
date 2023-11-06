import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class _p134_Archivos3 {
    public static void main(String[] args) {
        File arch = new File("nombres.txt");

        if (!arch.exists()) {
            System.out.println("El archivo no existe !!");
        } else {
            try {
                BufferedReader fnombres = new BufferedReader(new FileReader(arch));
                String Linea;
                System.out.println("Los nombres almacenados en el archivo son : ");
                while ((Linea = fnombres.readLine()) != null) {
                    System.out.println(Linea);
                }
                fnombres.close();
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo " + e);
            }
        }
        System.out.println("Longitud del archvio " + arch.length() + " bytes");
    }
}
