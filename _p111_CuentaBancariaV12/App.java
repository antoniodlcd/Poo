package _p111_CuentaBancariaV12;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Banco miBanco = new Banco("Banco del Norte SA de CV", "Privada de las Cumbres 123");
        miBanco.reporte();

        // crear clientes
        miBanco.agregarClientes(new Cliente("Carlos Fuentes"));
        miBanco.agregarClientes(new Cliente("Juan de la Fuente"));
        miBanco.agregarClientes(new Cliente("Rene Mayorga"));
        miBanco.agregarClientes(new Cliente("María Vazquez"));
        miBanco.reporte();

        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.10));
        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.20));
        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeCheques(1000, 500));
        miBanco.getClientes().get(1).agregarCuenta(new CuentaDeCheques(2500, 500));
        miBanco.getClientes().get(2).agregarCuenta(new CuentaDeCheques(2000, 600));
        miBanco.getClientes().get(2).agregarCuenta(new CuentaDeAhorro(2000, 0.40));
        miBanco.reporte();

        miBanco.getClientes().get(0).getCuentas().get(0).retira(500);
        miBanco.getClientes().get(0).getCuentas().get(1).retira(500);
        miBanco.getClientes().get(1).getCuentas().get(0).deposita(100);
        miBanco.getClientes().get(2).getCuentas().get(0).deposita(300);
        miBanco.getClientes().get(2).getCuentas().get(1).retira(1000);
        miBanco.reporte();
        miBanco.calcularInteres();
        miBanco.reporte();
    }
}