import java.io.*;

public class _p133_Archivos2 {
    public static void main(String[] args) {
        String[] nombres = {"juan", "pedro", "luis", "jose", "reynaldo", "maria", "teresa", "rosa"};
        File arch = new File("nombres.txt");

        if (arch.exists()) {
            System.out.println("El archivo ya existe!!, lo borré");
            arch.delete();
        } else {
            try {
                BufferedWriter fnombres = new BufferedWriter(new FileWriter(arch));
                for (String nombre : nombres) {
                    fnombres.write(nombre + " \n");
                }
                System.out.println("Los datos han sido escritos en el archivo " + arch.getName());
                fnombres.close();
                
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo " + e);
            }
        }
        System.out.println("Longitud final del archivo " + arch.length() + " bytes");
    }
}
