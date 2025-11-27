public class AppBiblioteca {
    public static void main(String[] args) {

        Biblioteca biblio = new Biblioteca("Biblioteca FICA", "Av. UDLA", "0999999999", 10);

        Libro libro1 = new Libro("Programación en Java", "Herbert Schildt", "ISBN-001", 45.50, true,
                800, "Programación", "McGraw-Hill");
        Libro libro2 = new Libro("Estructuras de Datos", "Mark Allen Weiss", "ISBN-002", 39.99, true,
                600, "Computación", "Pearson");

        Revista revista1 = new Revista("Software Engineering", "ACM", "ISSN-1001",
                10.00, true, 25, "Mensual", "Ingeniería");
        Revista revista2 = new Revista("Tech World", "Varios", "ISSN-1002",
                8.50, false, 12, "Bimestral", "Tecnología");

        // Agregar recursos
        biblio.agregarRecurso(libro1);
        biblio.agregarRecurso(libro2);
        biblio.agregarRecurso(revista1);
        biblio.agregarRecurso(revista2);

        // Mostrar información usando los nuevos métodos
        biblio.mostrarRecursos();
        biblio.mostrarLibros();
        biblio.mostrarRevistas();
    }
}