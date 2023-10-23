package _p113_SegundoExamenParcial;

public abstract class Jugador {
    protected String Nombre;
    protected char Sexo;
    protected String Descripcion;
    protected double Salario;
    protected double Total;
    
    // constructor
    public Jugador() {
    }

    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        Nombre = nombre;
        Sexo = sexo;
        Descripcion = descripcion;
        Salario = salario;
    }

    // getter y setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char sexo) {
        Sexo = Character.toUpperCase(sexo);
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

    // método abstracto para calcular el bono
    public abstract double getBono();

    public abstract double getTotal();

    // método toString
    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripcion=" + Descripcion + ", Salario=" + Salario
                +"]";
    }


    
    
}
