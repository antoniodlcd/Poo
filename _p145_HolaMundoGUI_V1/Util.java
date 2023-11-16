package _p145_HolaMundoGUI_V1;

import java.util.ArrayList;

public class Util {
    public static ArrayList<Estudiante> inicializaDatos() {
        ArrayList<Estudiante> datos = new ArrayList<>();
        datos.add(new Estudiante("juan Perez", 22, 34.5, "jperez@gmail.com"));
        datos.add(new Estudiante("Enrique Peña", 54, 75.5, "epeña@gmail.com"));
        datos.add(new Estudiante("Andres Lopez", 65, 70, "alopez@gmail.com"));
        return datos;
    }
}
