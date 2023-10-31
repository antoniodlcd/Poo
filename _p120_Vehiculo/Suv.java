package _p120_Vehiculo;

public class Suv extends Maquina implements TodoTerreno {
    
    // constructor
    public Suv (String nombre, String propietario, int pasajeros){
        super(nombre, propietario, pasajeros);
    }

    // métodos de sobreescritura
    @Override
    public void chasisIndependiente() {
        System.out.println("Es un autómovil con chaisis independiente es una Suv");
    }
    @Override
    public void traccion4x4() {
        System.out.println("Es un autómovil con tracción 4 x 4 es una Suv");
    }
    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil de combustion interna es una Suv");
    }
    @Override
    public void sistemaElectrico() {
        System.out.println("Es un autómovil con sistema eléctrico es una Suv");
    }


}
