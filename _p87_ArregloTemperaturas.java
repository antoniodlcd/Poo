// Calcula el mayor, el menor y busca en un arreglo de números flotantes usando funciones



public class _p87_ArregloTemperaturas {

    public static void Mostrar(double[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static double Mayor(double[] a) {
        double m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > m) m = a[i];
        }
        return m;
    }
    public static double Menor(double[] a) {
        double m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < m) m = a[i];
        }
        return m;
    }

    public static int Buscar(double[] a, double bus) {
        int pos = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == bus) { pos = i; break; }
        }
        return pos;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        double[] temps = {12.34,55.22,56.78,10,10.25,60.22};

        System.out.println("\nTemperaturas: ");
        Mostrar(temps);

        System.out.println("\nEl elemento mayor es : "+ Mayor(temps));
        System.out.println("\nEl elemento menor es : "+ Menor(temps));

        int pos = Buscar(temps, 10.0);
        if (pos != -1) 
            System.out.println("\nEl elemento fue encontrado en la posición " + pos);
        else
            System.out.println("\nEl elemento buscado no existe en el arreglo de temperaturas");
    }
}
