package _p111_CuentaBancariaV12;

import java.util.ArrayList;

public class Cliente {
    private String Nombre;
    private ArrayList<CuentaBancaria> Cuentas;
    
    // constructor
    public Cliente() { // constructor vacío
        Cuentas = new ArrayList<>();
    }

    public Cliente(String nombre) {
        this(); // manda a llamar al contructor vacío
        Nombre = nombre;
    }

    // getters y setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public ArrayList<CuentaBancaria> getCuentas() {
        return Cuentas;
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        Cuentas.add(cuenta);
    }

    public double getTotal(){
        double total = 0;
        for (CuentaBancaria cuenta : Cuentas) {
            total += cuenta.getSaldo();
        }
        return total;
    }

    // método toString
    @Override
    public String toString() {
        return "Cliente [Nombre=" + Nombre + ", Cuentas=" + Cuentas.size() + ", Total=" + this.getTotal() + "]";
    }


    
}
