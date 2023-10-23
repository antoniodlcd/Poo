package _p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int Partidos;
    private int Goles;
    
    // constructor
    public JugadorActivo(int partidos, int goles) {
        Partidos = partidos;
        Goles = goles;
    }
    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        Partidos = partidos;
        Goles = goles;
    }
    public int getPartidos() {
        return Partidos;
    }
    public void setPartidos(int partidos) {
        Partidos = partidos;
    }
    public int getGoles() {
        return Goles;
    }
    public void setGoles(int goles) {
        Goles = goles;
    }

    // método sobrecargardo para calcular el bono
    @Override
    public double getBono() {
        double bono = (Salario * 0.15) + (Partidos * 50) + (Goles * 5);
        return bono;
    }

    // métpdo para calcular el total
    @Override
    public double getTotal() {
        Total = Salario + getBono();
        return Total;
    }
    
    // método toString
    @Override
    public String toString() {
        return "JugadorActivo [" + super.toString() + "Partidos=" + Partidos + ", Goles=" + Goles +  ", Total=" + Total + "]";
    }

}
