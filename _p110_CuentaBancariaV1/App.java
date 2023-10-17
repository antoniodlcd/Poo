package _p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("\nProbando clase CuentaBancaria");
        CuentaBancaria cuenta1 = new CuentaBancaria(5000);

        System.out.println("Saldo inicial : "+ cuenta1.getSaldo());
        cuenta1.deposita(10000);
        System.out.println("Saldo deposito : " + cuenta1.getSaldo());
        
        double cretiro = 1500;
        boolean retiro = cuenta1.retira(cretiro);
        if (retiro) System.out.println("Retiro de " + cretiro + " exitoso, ya puedes ir a pistear, te queda " + cuenta1.getSaldo());
        else System.out.println("Lástima margarito, que otro te invite");


        System.out.println("\nProbando clase cliente");
        Cliente cliente1 = new Cliente("Juán Margarito Pérez", cuenta1);
        System.out.println("Cliente 1 "+ cliente1);
        Cliente cliente2 = new Cliente("Carlos Castañeda", new CuentaBancaria(1000));
        System.out.println("Cliente 2 : " + cliente2);

        cliente2.getCuenta().deposita(8500);
        System.out.println("Cliente 2 después del depósito de 8500 : " + cliente2);
        
        if (cliente2.getCuenta().retira(2000)){
            System.out.println("El retiro de 1500 fue exitoso, te queda : " + cliente2.getCuenta().getSaldo());
        } else System.out.println("Faquin shit no more money");

        System.out.println("\nProbando clase banco");
        Banco mibanco = new Banco("Banco Patito SA de CV", "Calle la Escondida S/N");
        mibanco.agregarCliente(cliente1);
        mibanco.agregarCliente(cliente2);
        mibanco.agregarCliente(new Cliente("Felipe Correo", new CuentaBancaria(2000)));
        mibanco.getClientes().get(0).getCuenta().deposita(1500);
        mibanco.getClientes().get(1).getCuenta().retira(1000);
        mibanco.getClientes().get(2).getCuenta().deposita(12000);

        double totalBanco = 0;

        for (Cliente cliente : mibanco.getClientes()) {
            System.out.println(cliente);
            totalBanco += cliente.getCuenta().getSaldo();
        }

        System.out.println("Total de dinero en el banco : " + totalBanco);



    }
}
