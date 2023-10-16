package _p108_Vehiculo;

public class Compacto extends Vehiculo{
    private int Pasajeros;
    private int Puertos;
    
    // constructor
    public Compacto() {
    }
    public Compacto(String serie, String marca, int año, double precio, int pasajeros, int puertos) {
        super(serie, marca, año, precio);
        Pasajeros = pasajeros;
        Puertos = puertos;
    }

    // getters y setters
    public int getPasajeros() {
        return Pasajeros;
    }
    public void setPasajeros(int pasajeros) {
        Pasajeros = pasajeros;
    }
    public int getPuertos() {
        return Puertos;
    }
    public void setPuertos(int puertos) {
        Puertos = puertos;
    }
    @Override
    public String toString() {
        return "Compacto [" + super.toString() + "Pasajeros=" + Pasajeros + ", Puertos=" + Puertos + "]";
    }
    
    
}
