// Es el sistema de una pizzería

import java.util.Scanner;

public class _p36_CompraPizza {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        char tamaño; String tamañoString; int cantidad, descuento; double total,total_descuento, cantidad_descontada;
        Scanner obj = new Scanner(System.in);

        System.out.print("Es el sistema de una pizzería\n");

        System.out.print("\n[C] Chica     $5");
        System.out.print("\n[M] Mediana   $10");
        System.out.print("\n[G] Grande    $15\n");

        System.out.print("\nElige el tamaño > "); 
        tamaño = Character.toUpperCase(obj.next().charAt(0));
        System.out.print("Elige la cantidad > "); 
        cantidad = obj.nextInt();

        total = 0;
        descuento = 0;
        total_descuento = 0;
        cantidad_descontada = 0;
        tamañoString = "";
        switch (tamaño) {
            case 'C' : 
                total = (double) cantidad * 5.0;
                tamañoString = "Chica";
                break;
            case 'M' : 
                total = (double) cantidad * 10.0; 
                tamañoString = "Mediana";
                break;
            case 'G' : 
                total = (double) cantidad * 15.0; 
                tamañoString = "Grande";
                break;
            default : System.out.print("\n!Error¡ ...esa opción no es válida");
        }
        
        if (total > 2000) {
            descuento = 15;
            cantidad_descontada = total * 0.15;
            total_descuento = total - cantidad_descontada;
        } else 
        total_descuento = total;

        System.out.printf(
            "\nHa elegido tamaño    [%s]" + 
            "\nCantidad de unidades [%,d]" + 
            "\nTotal bruto          [$%,.2f]" +
            "\nDescuento            [%d por ciento]" +
            "\nCantidad descontada  [$%,.2f]" +
            "\nTotal a pagar        [$%,.2f]",
            tamañoString, cantidad, total, descuento, cantidad_descontada, total_descuento);
        
        System.out.print("\nGracias por su compra!!!");

    }
}
