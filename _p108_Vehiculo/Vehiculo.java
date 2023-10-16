package _p108_Vehiculo;

public class Vehiculo {
    protected String Serie;
    protected String Marca;
    protected int Año;
    protected double Precio;

    // constructor
    public Vehiculo() {
        
    }
    public Vehiculo(String serie, String marca, int año, double precio) {
        Serie = serie;
        Marca = marca;
        Año = año;
        Precio = precio;
    }

    // getters y setters
    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        Año = año;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo [Serie=" + Serie + ", Marca=" + Marca + ", Año=" + Año + ", Precio=" + Precio + "]";
    }

    

    
}
