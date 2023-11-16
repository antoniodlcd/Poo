package _p146_HolaMundoGUI_V2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Estudiante> inicializaDatos() {
        ArrayList<Estudiante> datos = new ArrayList<>();
        datos.add(new Estudiante("juan Perez", 22, 34.5, "jperez@gmail.com"));
        datos.add(new Estudiante("Enrique Peña", 54, 75.5, "epeña@gmail.com"));
        datos.add(new Estudiante("Andres Lopez", 65, 70, "alopez@gmail.com"));
        return datos;
    }

    public static void serializarDatos(String archivo, ArrayList<Estudiante> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream festudiantes = new ObjectOutputStream(arch);
        festudiantes.writeObject(datos);
        festudiantes.close();
    }

    public static ArrayList<Estudiante> deserializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Estudiante> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream festudiantes = new ObjectInputStream(arch);
        datos = (ArrayList<Estudiante>) festudiantes.readObject();
        festudiantes.close();
        return datos;
    }

}
