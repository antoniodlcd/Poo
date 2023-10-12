package _p106_Persona;


public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Persona p1 = new Persona("Carlos Castañeda", "Av México 115");
        Persona p2 = new Persona("Alma Gonzales", "Primera de los Bolos 234");

        Estudiante estudiante = new Estudiante(p1, "Ing. Software", 2023, 500);
        System.out.println(estudiante);

        estudiante.setNombre("Urbano");
        System.out.println("Nombre       : " + estudiante.getNombre());
        System.out.println("Dirección    : " + estudiante.getDirección());
        System.out.println("Carrera      : " + estudiante.getCarrera());
        System.out.println("Año          : " + estudiante.getAño());
        System.out.println("Colegiatura  : " + estudiante.getColegiatura());
        
        Apoyo apoyo = new Apoyo(p2, "Licenciatura", 1000);
        apoyo.setPaga(2500);
        System.out.println("Nombre       : " + apoyo.getNombre());
        System.out.println("Dirección    : " + apoyo.getDirección());
        System.out.println("Escolaridad  : " + apoyo.getEscolaridad());
        System.out.println("Paga         : " + apoyo.getPaga());
        
        Apoyo apoyo2 = new Apoyo("Sra Tere", "Sierra Madre 22", "Secundaria", 1500);
        Estudiante estudiante2 = new Estudiante("Edgar ", "Calle de abajo 134", "Ing Civil", 2024, 2500);
        
       System.out.println(apoyo2);
       System.out.println(estudiante2);
        
    }
}
