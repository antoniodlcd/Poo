package _p120_Vehiculo;

public class Maquina {
    private String Nombre;
    private String Propietario;
    private int Pasajeros;
    
    // constructor
    public Maquina(String nombre, String propietario, int pasajeros) {
        Nombre = nombre;
        Propietario = propietario;
        Pasajeros = pasajeros;
    }

    // getters
    public String getNombre() {
        return Nombre;
    }
    public String getPropietario() {
        return Propietario;
    }
    public int getPasajeros() {
        return Pasajeros;
    }

    // métodos para 
    public void repostar(){
        System.out.println("Repostando ...");
    }
    public void arrancar(){
        System.out.println("Arrancando ...");
    }
    public void frenar(){
        System.out.println("Frenando ...");
    }

    // método toString
    @Override
    public String toString() {
        return "Maquina [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Pasajeros=" + Pasajeros + "]";
    }
    
    
}
