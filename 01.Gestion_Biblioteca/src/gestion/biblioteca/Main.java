package gestion.biblioteca;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("Genesis", "Dennis Prager", 2012);
        Libro libro2 = new Libro("Trading Evolved", "Andreas Clenow", 2020);
        Libro libro3 = new Libro("Master The Markets", "Tom Williams", 2018);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        System.out.println("Listado de todos los libros de la biblioteca");
        List<Libro> listado = biblioteca.obtenerTodosLosLibros();
        imprimirListados(listado);
        System.out.println("\nFiltro de libros por autor: \"Tom Williams\"\n");
        List<Libro> busquedaPorAutor = biblioteca.buscarLibrosPorAutor("Tom Williams");
        imprimirListados(busquedaPorAutor);
        System.out.println("\nEliminación de libro por título: \"Master the Markets\"\n");
        System.out.println(biblioteca.eliminarLibroPorTitulo("Master the Markets"));
        System.out.println("\nConteo de libros de la biblioteca por autor\n");
        Map<String, Integer> conteo = biblioteca.contarLibrosPorAutor();
        for (Map.Entry<String, Integer> entry : conteo.entrySet()) {
            System.out.println("Autor: " + entry.getKey() + " -> Libros: " + entry.getValue());
        }
    }

    private static void imprimirListados(List<Libro> lista) {
        for (Libro l : lista) {
            System.out.println("Título: " + l.getTitulo() + ", Autor: "
                    + l.getAutor() + " , Año de publicación: " + l.getAnnoPublicacion());
        }
    }
}