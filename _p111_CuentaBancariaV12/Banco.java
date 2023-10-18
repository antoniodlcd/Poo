package _p111_CuentaBancariaV12;

import java.util.ArrayList;

public class Banco {
    private String Nombre;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;
    
    // constructor
    public Banco() { // constructor vacío
        Clientes = new ArrayList<>();
    }
    
    public Banco(String nombre, String domicilio) {
        this(); // llama al constructor vacío
        Nombre = nombre;
        Domicilio = domicilio;
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

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void agregarClientes(Cliente cliente) {
        Clientes.add(cliente);
    }

    private double getTotal() {
        double total = 0;
        for (Cliente cliente : Clientes) {
            total += cliente.getTotal();
        }
        return total;
    }

    // método para calcular el interes de todas las cuentas de todos los clientes
    public void calcularInteres() {
        for (Cliente cliente : Clientes) {
            for (CuentaBancaria cuenta : cliente.getCuentas()) {
                if (cuenta instanceof CuentaDeAhorro){
                    ((CuentaDeAhorro)cuenta).calcularInteres();
                }
            }
        }
    }

    // reporte de todos los clientes y sus cuentas
    public void reporte() {
        System.out.println(this);
        for (Cliente cliente : Clientes) {
            System.out.println("> " + cliente);
            for (CuentaBancaria cuenta : cliente.getCuentas()) {
                 System.out.println("\t" + cuenta);
            }
        }
        System.out.println("\n");
    }

    // método toString
    @Override
    public String toString() {
        return "Banco [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Clientes=" + Clientes.size() + ", Total=" + getTotal() + "]";
    }

    
    
}
