import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _p126_Excepcion6 {
    public static void main(String[] args) {

        try {

            File nombres = new File("nombres.txt");
            Scanner arch = new Scanner(nombres);
            while(arch.hasNextLine())
                System.out.println(arch.nextLine());
            arch.close();
        } catch ( FileNotFoundException e) {
            System.out.println("El archivo que intentas leer no existe, mejor vete a almorzar");
        }
    }
}
