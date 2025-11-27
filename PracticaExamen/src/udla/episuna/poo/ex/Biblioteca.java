package udla.episuna.poo.ex;
import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private String telefono;
    private int capacidad;
    private ArrayList<Recurso> recursos;

    public Biblioteca(String nombre, String direccion, String telefono, int capacidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.capacidad = capacidad;
        this.recursos = new ArrayList<>();
    }

    // Método para agregar recursos
    public void agregarRecurso(Recurso recurso) {
        if (recursos.size() < capacidad) {
            recursos.add(recurso);
            System.out.println("Recurso agregado: " + recurso.getTitulo());
        } else {
            System.out.println("La biblioteca está llena, no se pueden agregar más recursos.");
        }
    }

    // Método para mostrar TODOS los recursos
    public void mostrarRecursos() {
        System.out.println("\n--- TODOS LOS RECURSOS ---");
        for (Recurso r : recursos) {
            System.out.println(r);
        }
    }

    // Método para mostrar solo LIBROS
    public void mostrarLibros() {
        System.out.println("\n--- SOLO LIBROS ---");
        for (Recurso r : recursos) {
            if (r instanceof Libro) {
                System.out.println(r);
            }
        }
    }

    // Método para mostrar solo REVISTAS
    public void mostrarRevistas() {
        System.out.println("\n--- SOLO REVISTAS ---");
        for (Recurso r : recursos) {
            if (r instanceof Revista) {
                System.out.println(r);
            }
        }
    }

    // Getters y setters (si tu profe los pide)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", capacidad=" + capacidad +
                ", recursos=" + recursos.size() +
                '}';
    }
}
