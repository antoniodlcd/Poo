package _p147_TercerExamenParcial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        return datos;
    }

    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) throws IOException{
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fjugadores = new ObjectOutputStream(arch);
        fjugadores.writeObject(datos);
        fjugadores.close();
    }

    public static ArrayList<Jugador> deserializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Jugador> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fjugadores = new ObjectInputStream(arch);
        datos = (ArrayList<Jugador>) fjugadores.readObject();
        fjugadores.close();
        return datos;
    }

}
