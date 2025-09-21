public class Libro implements Comparable<Libro> {

    // ATRIBUTOS DE INSTANCIA
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private double precio;

    // CONSTRUCTOR
    public Libro(String titulo, String autor, int anioPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
    }

// GETTERS & SETTERS

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // METODO toString()
    @Override
    public String toString() {
        return "\"%s\", %s, %d, $%.2f".formatted(titulo, autor, anioPublicacion, precio);
    }

    // METODOS DE INSTANCIA
    @Override
    public int compareTo(Libro o) {
        return this.titulo.compareTo(o.getTitulo());
    }
}