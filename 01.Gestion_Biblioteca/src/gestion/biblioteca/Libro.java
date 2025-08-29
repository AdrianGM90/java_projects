package gestion.biblioteca;

/**
 * Clase que representa un libro de una biblioteca.
 */
public class Libro {
    private String titulo;
    private String autor;
    private int annoPublicacion;
    /**
     * Crea instancias de Libro utilizando sus atributos específicos.
     *
     * @param titulo Título del libro.
     * @param autor Autor del libro.
     * @param annoPublicacion Año de publicación del libro.
     */
    public Libro(String titulo, String autor, int annoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.annoPublicacion = annoPublicacion;
    }
    /**
     * Getter que devuelve el título del libro.
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Getter que devuelve el autor del libro.
     */
    public String getAutor() {
        return autor;
    }
    /**
     * Getter que devuelve el año de publicación del libro.*/
    public int getAnnoPublicacion() {
        return annoPublicacion;
    }
}