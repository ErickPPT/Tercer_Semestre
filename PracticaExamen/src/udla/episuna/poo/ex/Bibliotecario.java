package udla.episuna.poo.ex;
public class Bibliotecario {
    private String nombre;
    private String id;
    private String turno;
    private double salario;
    private Biblioteca biblioteca;

    public Bibliotecario(String nombre, String id, String turno, double salario, Biblioteca biblioteca) {
        this.nombre = nombre;
        this.id = id;
        this.turno = turno;
        this.salario = salario;
        this.biblioteca = biblioteca;
    }

    // Método para asignar biblioteca
    public void asignarBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        System.out.println("Biblioteca asignada al bibliotecario " + nombre + ": " + biblioteca.getNombre());
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", turno='" + turno + '\'' +
                ", salario=" + salario +
                ", biblioteca=" + (biblioteca != null ? biblioteca.getNombre() : "Ninguna") +
                '}';
    }
}