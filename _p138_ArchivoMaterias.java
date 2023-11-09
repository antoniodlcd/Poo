import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class _p138_ArchivoMaterias {

    public static ArrayList<String> leeDatos() {
        String dato = "";
        ArrayList<String> datos = new ArrayList<>();
        Scanner obj = new Scanner(System.in);
        System.out.println("Introduce un dato, dato vacío para terminar");
        while (true){
            dato = obj.nextLine();
            if (!dato.isEmpty()) {
                datos.add(dato);
            } else break;
        }
        obj.close();
        return datos;
    }

    public static void grabarArchivo(ArrayList<String> datos, String archivo) throws IOException {
        BufferedWriter fdatos = new BufferedWriter(new FileWriter(new File(archivo)));
        for (String dato : datos) {
            fdatos.write(dato + "\n");
        }
        fdatos.close();
    }

    public static ArrayList<String> leerArchivo(String archivo) throws IOException {
        ArrayList<String> datos = new ArrayList<>();
        BufferedReader fdatos = new BufferedReader(new FileReader(new File(archivo)));
        String dato = "";
        while ((dato = fdatos.readLine()) != null) {
            datos.add(dato);
        }
        fdatos.close();
        return datos;

    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        ArrayList<String> materias = leeDatos(), lasmaterias;

        try {
            grabarArchivo(materias, "lasmaterias.txt");
            System.out.println("Leyendo los datos del archivo ...");
            lasmaterias = leerArchivo("lasmaterias.txt");
            lasmaterias.forEach(n -> System.out.println(n));
        } catch (Exception e) {
            System.out.println("Error al procesar el archivo : " + e);
        }
    }
}
