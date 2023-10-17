package _p110_CuentaBancariaV1;

import java.util.ArrayList;

public class Banco {
    private String Nombre;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;

    // constructor vacío para reservar espacio en la memoria
    public Banco() {
        Clientes = new ArrayList<>();
    }

    // constructor que llama al constructor vacío
    public Banco(String nombre, String domicilio) {
        this();
        Nombre = nombre;
        Domicilio = domicilio;
    }

    // getters y setters
    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void agregarCliente(Cliente cliente) {
        Clientes.add(cliente);
    }

    // método toString
    @Override
    public String toString() {
        return "Banco [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Clientes=" + Clientes.size() + "]";
    }
    

    
}
