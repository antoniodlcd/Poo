package _p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo{
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador>jugadores;
    
    // constructor
    public Equipo() {
        jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String liga) {
        this();
        Nombre = nombre;
        Liga = liga;
    }

    
    // getters y setters
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getLiga() {
        return Liga;
    }
    public void setLiga(String liga) {
        Liga = liga;
    }

    // método que regresa el arreglo de jugadores
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    // método que agrega un jugador al arreglo
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    // método que calcula el total del bono de todos los jugadores
    public double getTotlaBono() {
        double totalBono = 0;
        for (Jugador jugador : jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    // método que calcula el total de los totales de los jugadores
    public double getTotal() {
        double total = 0;
        for (Jugador jugador : jugadores) {
            total += jugador.getTotal();
        }
        return total;
    }

    public int getTotalH() {
        int totalH = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'H') {
                totalH += 1;
            }
        }
        return totalH;
    }
    public int getTotalM() {
        int totalM = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'M') {
                totalM += 1;
            }
        }
        return totalM;
    }
    
    // método para mostrar un reporte
    public void reporte() {
        System.out.println("Reporte del Equipo : ");
        System.out.println("\t> Nombre    : " + Nombre);
        System.out.println("\t> Liga      : " + Liga);
        System.out.printf("\t> Jugadores : %d\n" , getTotalH() + getTotalM());
        System.out.println("\t> Bono      : " + getTotlaBono());
        System.out.println("\t> Total     : " + getTotal());
        System.out.println("\t> Hombres   : " + getTotalH());
        System.out.println("\t> Mujeres   : " + getTotalM());
        System.out.println();
        for (Jugador jugador : jugadores) {
            System.out.println("\t>> " + jugador.toString());
        }
        
    }
    // método toString
    @Override
    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", jugadores=" + jugadores + "]";
    }

    

}
