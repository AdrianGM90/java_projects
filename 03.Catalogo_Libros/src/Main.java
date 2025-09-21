import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Libro> libros = cargaDatos();

        System.out.println("Lista de libros ordenados en orden alfabético:");
        libros.sort(null);
        print(libros);

        // Clase anónima con Comparator
        Comparator<Libro> comparatorDesc = new Comparator<>() {

            @Override
            public int compare(Libro o1, Libro o2) {
                return Integer.compare(o2.getAnioPublicacion(), o1.getAnioPublicacion());
            }
        };

        System.out.println("\nLibros ordenados por año de publicación en orden descendente:");
        libros.sort(comparatorDesc);
        print(libros);

        Comparator<Libro> librosPorPrecio = (libro1, libro2) ->
                Double.compare(libro1.getPrecio(), libro2.getPrecio());
        ;

        System.out.println("\nLibros ordenados por precio en orden ascendente:");
        libros.sort(librosPorPrecio);
        print(libros);

        Comparator<Libro> librosAutorTitulo = Comparator
                .comparing((Libro libro) -> libro.getAutor())
                .thenComparing((Libro libro) -> libro.getTitulo());

        System.out.println("\nLibros ordenados por autor y por título:");
        libros.sort(librosAutorTitulo);
        print(libros);
    }

    public static List<Libro> cargaDatos() {
        List<Libro> lista = new ArrayList<>();
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, 19.99);
        Libro libro2 = new Libro("El nombre del viento", "Patrick Rothfuss", 2007, 14.95);
        Libro libro3 = new Libro("El problema de los tres cuerpos", "Liu Cixin", 2008, 5.00);
        Libro libro4 = new Libro("Rebelión en la granja", "George Orwell", 1983, 7.50);
        Libro libro5 = new Libro("1984", "George Orwell", 1984, 22.00);
        Libro libro6 = new Libro("Fahrenheit 451", "Ray Bradbury", 1953, 10.99);
        Libro libro7 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954, 25.00);
        Libro libro8 = new Libro("Los juegos del hambre", "Suzanne Collins", 2008, 9.99);
        lista.add(libro1);
        lista.add(libro2);
        lista.add(libro3);
        lista.add(libro4);
        lista.add(libro5);
        lista.add(libro6);
        lista.add(libro7);
        lista.add(libro8);
        return lista;
    }


    public static void print(List<Libro> lista) {
        for (Libro l : lista) {
            System.out.println(l);
        }
    }
}
