package _p145_HolaMundoGUI_V1;

import java.io.Serializable;

public class Estudiante implements Serializable {
    String Nombre;
    int Edad;
    double Peso;
    String Correo;

    // contructor
    public Estudiante(String nombre, int edad, double peso, String correo) {
        Nombre = nombre;
        Edad = edad;
        Peso = peso;
        Correo = correo;
    }

    // getters y setters
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
    public double getPeso() {
        return Peso;
    }
    public void setPeso(double peso) {
        Peso = peso;
    }
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String correo) {
        Correo = correo;
    }
}