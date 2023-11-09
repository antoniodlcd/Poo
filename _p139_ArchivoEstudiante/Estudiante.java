package _p139_ArchivoEstudiante;

public class Estudiante {
    private String Nombre;
    private int Edad;
    private double Promedio;
    private char Sexo;

    
    
    // constructor
    public Estudiante(String nombre, int edad, double promedio, char sexo) {
        Nombre = nombre;
        Edad = edad;
        Promedio = promedio;
        Sexo = sexo;
    }

    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    
    public int getEdad() {
        return Edad;
    }
    
    public void setEdad(int edad) {
        Edad = edad;
    }
    
    public double getPromedio() {
        return Promedio;
    }
    
    public void setPromedio(double promedio) {
        Promedio = promedio;
    }
    
    public char getSexo() {
        return Sexo;
    }
    
    public void setSexo(char sexo) {
        Sexo = sexo;
    }
    
    // método toStrings
    @Override
    public String toString() {
        return "Estudiante [Nombre=" + Nombre + ", Edad=" + Edad + ", Promedio=" + Promedio + ", Sexo=" + Sexo + "]";
    }
}
