package _p116_Juego;

import java.util.Scanner;

public class JuegoAdivina implements Juego {
    private int num, intentos;
    private Scanner teclado;

    public JuegoAdivina () {
        teclado = new Scanner(System.in);
    }
    
    @Override
    public void iniciar() {
        num = 1 + (int) (Math.random() * 10);        
    }

    
    @Override
    public void jugar() {
        int num;
        do {
            System.out.print("Adivina el número entre 1 y 100 > "); num = teclado.nextInt();
            if (this.num < num) System.out.println("El número a adividar es menor");
            else if (this.num > num) System.out.println("El número a adivinar es mayor");     
            intentos ++;
        } while (this.num != num);
    }
    
    @Override
    public void finalizar() {
        System.out.println(this.num + " era el número !!!, ganaste el juego después de " + intentos + " intentos");        
    }
    

}
