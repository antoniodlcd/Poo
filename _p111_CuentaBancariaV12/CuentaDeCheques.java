package _p111_CuentaBancariaV12;

public class CuentaDeCheques extends CuentaBancaria{
    private double Sobregiro;

    // constructor
    public CuentaDeCheques(double saldo, double sobregiro) {
        super(saldo);
        Sobregiro = sobregiro;
    }

    // método para retirar
    @Override
    public boolean retira(double cantidad) {
        if (Saldo >= cantidad) {
            Saldo -= cantidad;

        } else {
            double requerida = cantidad - Saldo;
            if (Sobregiro >= requerida) {
                Saldo = 0;
                Sobregiro -= requerida;
            }
        }
        return true;
    }


    // método toString
    @Override
    public String toString() {
        return "CuentaDeCheques [ " +super.toString() + " Sobregiro=" + Sobregiro + "]";
    }

    
    
    
}
