package _p101_TrabajoPersona;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Persona persona1 = new Persona();
        Trabajo trabajo = new Trabajo();

        trabajo.setId(1);
        trabajo.setRol("Chofer");
        trabajo.setSalario(200);
        persona1.setNombre("Julia Urina");
        persona1.setTrabajo(trabajo);
        System.out.println(persona1);

        Persona persona2 = new Persona("José Pérez", new Trabajo(2, "Cocinero", 2500));
        System.out.println(persona2);

        Persona persona3 = new Persona("Antonio de la Cruz", new Trabajo(3, "Inge", 1500000));
        System.out.println(persona3);
    }
}
