package _p120_Vehiculo;

public class Sedan extends Maquina implements Familiar{

    // constructor
    public Sedan (String nombre, String propietario, int pasajeros){
        super(nombre, propietario, pasajeros);
    }
    
    // métodos de sobreescritura
    @Override
    public void carroceriaTres() {
        System.out.println("Es de tipo familiar con carroceria en tres partes es un Sedan");
    }
    @Override
    public void chasisMonocasco() {
        System.out.println("Es de tipo familiar con chasis monocasco es un Sedan");
    }
    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil de combustion interna es un Sedan");
    }
    @Override
    public void sistemaElectrico() {
        System.out.println("Es un autómovil con sistema eléctrico es un Sedan");
    }

    

}
