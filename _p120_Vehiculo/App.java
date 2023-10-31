package _p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        Sedan misedan = new Sedan("Vochito", "María Díaz", 4);
        System.out.println(misedan + "\n");
        misedan.sistemaElectrico();
        misedan.combustionInterna();
        misedan.carroceriaTres();
        misedan.chasisMonocasco();
        misedan.repostar();
        misedan.arrancar();
        misedan.frenar();
        System.out.println();

        Suv misuv = new Suv("La Mamalona", "Carlos Castañeda", 6);
        System.out.println(misuv + "\n");
        misuv.sistemaElectrico();
        misuv.combustionInterna();
        misuv.traccion4x4();
        misuv.chasisIndependiente();
        misuv.repostar();
        misuv.arrancar();
        misuv.frenar();
    }
}
