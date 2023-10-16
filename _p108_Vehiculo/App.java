package _p108_Vehiculo;

import java.util.ArrayList;

import _p107_Forma.Forma;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Compacto v1 = new Compacto("CP0100010122", "Ford", 2023, 125345.22, 4, 2);
        Compacto v2 = new Compacto("CP1000145555", "Nissan", 2010, 54500.33, 6, 4);
        Camioneta v3 = new Camioneta("CA1040145445", "Dina", 2008, 234567.15, 450.0, 4);
        Camioneta v4 = new Camioneta("CA7748145999", "Hongyan", 2023, 934577.98, 1200.0, 6);

        ArrayList<Vehiculo> autos = new ArrayList<>();
        autos.add(v1);
        autos.add(v2);
        autos.add(v3);
        autos.add(v4);

        for (Vehiculo auto : autos) {
            System.out.println(auto);
        }
        
        System.out.println("\nCalculando el total de precio de todos los vehículos : ");
        double suma = 0;
        for (Vehiculo auto : autos) {
            double precio = auto.getPrecio();
            System.out.println(precio);
            suma += precio; 
        }

        System.out.printf("\nLa suma de precios es : %.2f", suma);
    }
}
