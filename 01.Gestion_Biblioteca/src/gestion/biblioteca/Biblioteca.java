package gestion.biblioteca;

import java.util.*;

/**
 * Clase que representa una biblioteca.
 * Cuenta con funciones para añadir y listar libros.
 *
 * @see Libro
 */
public class Biblioteca {
    private List<Libro> libros;

    /**
     * Crea instancias de Biblioteca con sus atributos específicos
     */
    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }

    /**
     * Añade libros a al conjunto de libros de la biblioteca.
     *
     * @param libro Libro a añadir a la biblioteca
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Extrae un listado con el conjunto de libros de la biblioteca.
     *
     * @return Listado de libros de la biblioteca.
     */
    public List<Libro> obtenerTodosLosLibros() {
        return new ArrayList<>(libros);
    }

    /**
     * Busca todos los libros escritos por un autor específico.
     *
     * @param autor Autor del libro sobre el que filtrar los resultados.
     */
    public List<Libro> buscarLibrosPorAutor(String autor) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                resultados.add(l);
            }
        }
        return resultados;
    }

    /**
     * Elimina el primer libro que coincide con el título dado.
     *
     * @param titulo Título del libro a eliminar.
     * @return true si el libro se ha eliminado, false si no se ha encontrado.
     */
    public boolean eliminarLibroPorTitulo(String titulo) {
        Iterator<Libro> iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    /**
     * Cuenta los libros que hay por cada autor de la biblioteca.
     *
     * @return Mapa con autores y cantidad de libros asociados.
     */
    public Map<String, Integer> contarLibrosPorAutor() {
        Map<String, Integer> conteo = new HashMap<>();
        for (Libro libro : libros) {
            String autor = libro.getAutor();
            conteo.put(autor, conteo.getOrDefault(autor, 0) + 1);
        }
        return conteo;
    }
}