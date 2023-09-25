// Lleva el control de el curso de programación de una escuela

import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        String nombre = "";
        int num = 0;
        int edad = 0, sumaEdad = 0; 
        int countHombres = 0, countMujeres = 0;
        int costo = 0, countAlumnos = 0, countTrabajadores = 0, countDocentes = 0, dineroTotal = 0;
        int dineroAlumnos = 0, dineroTrabajadores = 0, dineroDocentes = 0;
        double promedioEdad = 0;
        char tipo = ' ', sexo = ' '; 
        Scanner obj = new Scanner(System.in);

        System.out.print("Bienvenido al Curso de Técnicas Avanzadas de Programación\n");

        System.out.print("Cuántos integrantes va a ingresar? > "); num = obj.nextInt();

        for (int i = 1; i <= num; i++) {

            // System.out.print("Ingresa tu nombre > ");
            // nombre = obj.nextLine();
            do {
                System.out.print("Ingresa tu edad > "); edad = obj.nextInt();
                if (edad < 18) {
                    System.out.print("Tienes que ser mayor de edad!!\n");
                } else {
                    sumaEdad += 1;
                }
            } while (edad < 18);

            System.out.print("Ingresa tu sexo ( H / M ) > ");
            sexo = Character.toUpperCase(obj.next().charAt(0));
    
            switch (sexo) {
                case 'H' : countHombres += 1; break;
                case 'M' : countMujeres += 1; break;
            }

            System.out.print("[A]lumno\n" +
                            "[D]ocente\n" +
                            "[T]rabajador\n" +
                            "Ingrese su participación > "); 
            tipo = Character.toUpperCase((obj.next().charAt(0)));
            do {
                switch (tipo) {
                    case 'A' :costo = 50; countAlumnos += 1; dineroAlumnos += costo; break;
                    case 'D' :costo = 80; countDocentes += 1; dineroDocentes += costo; break;
                    case 'T' :costo = 60; countTrabajadores += 1; dineroTrabajadores += costo; break;
                    default : System.out.print("Opción incorrecta!!");
                }
            } while (!(tipo == 'A' || tipo == 'D' || tipo == 'T'));
        }
        
        dineroTotal = dineroAlumnos + dineroDocentes + dineroTrabajadores;
        promedioEdad = sumaEdad / num;        


        System.out.printf("Total de Alumnos               : %d\n" +
                        "Total de Docentes                : %d\n" +
                        "Total de trabajadores            : %d\n" +
                        "Total de Hombres en general      : %d\n" +
                        "Total de Mujeres en general      : %d\n" +
                        "Total de todos los participantes : %d\n" +
                        "Promedio de la edad de todos los participantes : %f", 
                        countAlumnos,countDocentes,countTrabajadores,countHombres,countMujeres,promedioEdad);


        System.out.printf("Total dinero recaudado de Alumnos    : %d\n" +
                        "Total dinero recaudado de Docentes     : %d\n" +
                        "Total dinero recaudado de Trabajadores : %d\n" +
                        "Total dinero en general                : %d",
                        dineroAlumnos, dineroDocentes, dineroTrabajadores, dineroTotal);

        obj.close();
    }
}