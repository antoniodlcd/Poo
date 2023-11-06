package _p136_Archivos5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class App {

    public static void serializarDatos(String archivo, ArrayList<Persona> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }

    public static ArrayList<Persona> deserializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Persona> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);
        datos = (ArrayList<Persona>) fpersonas.readObject();
        fpersonas.close();
        return datos;
    }

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>(), laspersonas;
        personas.add(new Persona("Carlos Perez", 22,85.5,"cperez@gmail.com"));
        personas.add(new Persona("María López", 15,34.5,"mlopez@gmail.com"));
        personas.add(new Persona("Juan Perez", 40,95.5,"jperez@gmail.com"));

        try {
            System.out.println("Escribiendo datos de personas en el archivo ...");
            serializarDatos("datos.dat", personas);

            System.out.println("Leyendo los datos del archivo en disco ...");
            laspersonas = deserializarDatos("datos.dat");
            laspersonas.forEach(p -> System.out.println(p));


        } catch (Exception e) {
            System.out.println("Error al manejar al archivo " + e);
        }
    }
}
