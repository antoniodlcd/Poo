// Inicializa al declarar, dos arreglos, uno con Nombres y otro con Edades

public class _p83_InicializaNombresEdades {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Luis", "José", "Mateo", "María"};
        int[] edades = {22,25,44,38,50,16};

        System.out.println("\nLos nombres son : ");
        for (String nombre : nombres) {
            System.out.printf("%s \n", nombre);
        }
        
        System.out.println("\nLas edades son : ");
        for (int edad : edades) {
            System.out.printf("%d \n", edad);
        }

        System.out.println("\nCada nombres con su respectiva edad : ");
        for (int i = 0; i < nombres.length; i++){
            System.out.printf("\nNombre : %s, Edad : %d ", nombres[i], edades[i]);
        }
        System.out.println("\n\nProceso terminado...");
    }
}
