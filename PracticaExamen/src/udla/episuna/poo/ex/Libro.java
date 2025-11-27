package udla.episuna.poo.ex;
public class Libro extends Recurso {
    private int numPaginas;
    private String genero;
    private String editorial;

    public Libro(String titulo, String autor, String isbn, double precio, boolean disponible,
                 int numPaginas, String genero, String editorial) {
        super(titulo, autor, isbn, precio, disponible);
        this.numPaginas = numPaginas;
        this.genero = genero;
        this.editorial = editorial;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", precio=" + getPrecio() +
                ", disponible=" + (isDisponible() ? "SI" : "NO") +
                ", numPaginas=" + numPaginas +
                ", genero='" + genero + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
