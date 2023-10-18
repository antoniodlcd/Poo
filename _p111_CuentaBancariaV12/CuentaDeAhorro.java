package _p111_CuentaBancariaV12;

public class CuentaDeAhorro extends CuentaBancaria{
    private double TasaInteres;

    // constructor
    public CuentaDeAhorro(double saldo, double tasaInteres) {
        super(saldo);
        TasaInteres = tasaInteres;
    }

    public void calcularInteres() {
        Saldo += Saldo * TasaInteres;
    }

    // método para retirar
    @Override
    public boolean retira(double cantidad) {
        if (Saldo >= cantidad) {
            Saldo -= cantidad;
            return true;
        }
        return false;
    }

    // método toString
    @Override
    public String toString() {
        return "CuentaDeAhorro [ " + super.toString() + " TasaInteres=" + TasaInteres + "]";
    }

    
    
}
