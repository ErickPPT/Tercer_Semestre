//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(0,0,0);
        System.out.println("Fecha actual: ");
        fecha.establecerFecha();
        System.out.println(fecha.mostrarFecha(fecha.getDia(),  fecha.getMes(), fecha.getAnio()));
    }
}