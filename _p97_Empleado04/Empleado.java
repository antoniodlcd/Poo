package _p97_Empleado04;

public class Empleado {
    private String Nombre;
    private int Edad;
    private char Sexo;
    private boolean casado;

    public Empleado() {

    }
    public Empleado(String nombre, int edad, char sexo, boolean casado) {
        this.Nombre = nombre;
        this.Edad = edad;
        this.Sexo = sexo;
        this.casado = casado;

    }
    
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char sexo) {
        Sexo = sexo;
    }
    
    public boolean getCasado(){
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
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
    @Override
    public String toString() {
        return "Empleado [Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + (Sexo=='H'?"Hombre":"Mujer") + ", casado=" + (casado?"Jodido":"Libre") + "]";
    }

}