package _p102_AutorLibro;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Libro libro1 = new Libro();
        Autor autor = new Autor();

        autor.setNombre("Baldor");
        autor.setCorreo("bardor@msn.com");
        libro1.setIsbn("100010145");
        libro1.setNombre("Álgebra para principiantes");
        libro1.setPrecio(1500);
        libro1.setCantidad(30);
        libro1.setAutor(autor);
        System.out.println(libro1);

        Libro libro2 = new Libro("211156519", "Ecuaciones Diferenciales", new Autor("El hijo de Baldor", "baldorson@hotmail.com"), 2300, 10);
        System.out.println(libro2);
        System.out.println("Nombre del Libro : " + libro1.getNombre());
        System.out.println("Nombre Autor     : " + libro2.getAutor().getNombre());
    }
}
