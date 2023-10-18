package _p111_CuentaBancariaV12;

public abstract class CuentaBancaria {
    protected double Saldo; // el protected es para que las clases hijas puedan utilizar las variables de esta clase

    // constructor
    public CuentaBancaria(double saldo) {
        Saldo = saldo;
    }

    // método para depositar
    public void deposita(double cantidad) {
        Saldo += cantidad;
    }

    // getter
    public double getSaldo() {
        return Saldo;
    }

    // función abstracta para retirar
    public abstract boolean retira(double cantidad);

    // método toString
    @Override
    public String toString() {
        return "CuentaBancaria [Saldo=" + Saldo + "]";
    }

    
}
