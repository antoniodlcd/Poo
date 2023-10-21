package _p112_ControlVentas;

import java.util.ArrayList;

public class Cliente {
    private String Nombre;
    private String Domicilio;
    private String Correo;
    private ArrayList<Venta> ventas;
    
    // constructor
    public Cliente() {
        ventas = new ArrayList<>();
    }

    public Cliente(String nombre, String domicilio, String correo) {
        this();                 // llama al constructor vacío
        Nombre = nombre;
        Domicilio = domicilio;
        Correo = correo;
    }

    // getters y setters
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDomicilio() {
        return Domicilio;
    }
    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String correo) {
        Correo = correo;
    }
    public ArrayList<Venta> getVentas() {
        return new ArrayList<>(ventas);
    }
    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    public void setVentas(Venta venta1) {
        this.ventas.add(venta1);
    }

    // método para calcular el total de ventas por cliente
    public double getTotal() {
        double total = 0;
        for (Venta venta : ventas) {
            total += venta.getTotalVenta();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Cliente [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Correo=" + Correo + "]";
    }

    
    

}

