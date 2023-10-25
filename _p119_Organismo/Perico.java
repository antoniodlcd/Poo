package _p119_Organismo;

public class Perico extends Organismo implements Ave{
    public Perico (String nombre) {
        super(nombre);
    }

    @Override
    public void multiCelular() {
        System.out.println("Es un animal multicelular, es un perico");        
    }

    @Override
    public void sangreCaliente() {
        System.out.println("Es un animal de sangre caliente, es un perico");        
    }
    @Override
    public void dosPatas() {
        System.out.println("Es un ave y camina en dos patas, es un perico");
    }

    @Override
    public void volar() {
        System.out.println("Es un ave que puede volar, es un perico");        
    }

}
