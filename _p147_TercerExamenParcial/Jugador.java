package _p147_TercerExamenParcial;

public class Jugador {
    private String Nombre;
    private int Edad;
    private char Sexo;
    private String EstadoCivil;
    private String Descripcion;
    private double Salario;

    // contructor vacío
    public Jugador() {
    }
    public Jugador(String nombre, int edad, char sexo, String estadoCivil, String descripcion, double salario) {
        Nombre = nombre;
        Edad = edad;
        Sexo = sexo;
        EstadoCivil = estadoCivil;
        Descripcion = descripcion;
        Salario = salario;
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
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char sexo) {
        Sexo = sexo;
    }
    public String getEstadoCivil() {
        return EstadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        EstadoCivil = estadoCivil;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double salario) {
        Salario = salario;
    }

    
}
