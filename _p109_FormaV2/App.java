package _p109_FormaV2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Circulo c1 = new Circulo("Rojo", true, 10.23);
        Circulo c2 = new Circulo("Verde", false, 99.12  );
        Rectangulo r1 = new Rectangulo("Amarillo", false, 10.0, 20.0);
        Rectangulo r2 = new Rectangulo("Azul", true, 15.0, 44.0);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(c1);
        formas.add(c2);
        formas.add(r1);
        formas.add(r2);

        System.out.println("Todas las formas : ");
        for (Forma forma : formas) {
            System.out.println(forma);
        }
        
        System.out.println("\nCalculando áreas y perímetros de las figuras : ");
        System.out.println("La forma es un Círculo");
        System.out.println("El área es      : " + c1.getArea());
        System.out.println("El perímetro es : " + c1.getPerimetro());
        System.out.println("La forma es un Círculo");
        System.out.println("El área es      : " + c2.getArea());
        System.out.println("El perímetro es : " + c2.getPerimetro());
        System.out.println("La forma es un Rectángulo");
        System.out.println("El área es      : " + r1.getArea());
        System.out.println("El perímetro es : " + r2.getPerimetro());
        System.out.println("La forma es un Rectángulo");
        System.out.println("El área es      : " + r1.getArea());
        System.out.println("El perímetro es : " + r2.getPerimetro());


    }
}
