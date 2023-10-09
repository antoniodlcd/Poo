package _p103_ClienteFactura;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Cliente cliente1 = new Cliente();
        Factura factura = new Factura();
        cliente1.setId("FIFA-0010");
        cliente1.setNombre("Leonardo Messi");
        cliente1.setDescuento(8);
        factura.setMonto(3500);
        factura.setCliente(cliente1);
        System.out.println(factura);
        System.out.println("Monto con descuento : " + factura.getMontoconDescuento());

        Factura factura2 = new Factura(2, new Cliente("LIGAMX-0012", "Guillermo Ochoa", 10), 5000);
        System.out.println("Factura Id          : " + factura2.getId());
        System.out.println(" - Cliente Id       : " + factura2.getCliente().getId());
        System.out.println(" - Cliente Nombre   : " + factura2.getCliente().getNombre());
        System.out.println(" - Cliente Desc     : " + factura2.getCliente().getDescuento()/100.0 + "%");
        System.out.println("Factura Monto       : " + factura2.getMonto());
        System.out.println("Monto con Descuento : " + factura2.getMontoconDescuento());
    }
}
