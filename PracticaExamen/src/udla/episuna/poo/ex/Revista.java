package udla.episuna.poo.ex;
public class Revista extends Recurso {
    private int numeroEdicion;
    private String periodicidad; // semanal, mensual, etc.
    private String categoria;

    public Revista(String titulo, String autor, String isbn, double precio, boolean disponible,
                   int numeroEdicion, String periodicidad, String categoria) {
        super(titulo, autor, isbn, precio, disponible);
        this.numeroEdicion = numeroEdicion;
        this.periodicidad = periodicidad;
        this.categoria = categoria;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", precio=" + getPrecio() +
                ", disponible=" + (isDisponible() ? "SI" : "NO") +
                ", numeroEdicion=" + numeroEdicion +
                ", periodicidad='" + periodicidad + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}