package _p110_CuentaBancariaV1;

public class CuentaBancaria {
    private double Saldo;

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

    // método para retirar
    public boolean retira(double cantidad) {
        if (Saldo >= cantidad) {
            Saldo -= cantidad;
            return true;
        } else return false;
    }
}