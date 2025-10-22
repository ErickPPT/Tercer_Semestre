import java.time.LocalDate;

public class Fecha {
    /** Atributos*/
    private int dia;
    private int mes;
    private int anio;

    /** Constructores*/
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /** Metodos propios de Java*/
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void establecerFecha(){
        LocalDate fecha = LocalDate.now();
        setDia(fecha.getDayOfMonth());
        setMes(fecha.getMonthValue());
        setAnio(fecha.getYear());
    }

    public String mostrarFecha(int d, int m, int a){
        String date=  Integer.toString(d) + "/" + Integer.toString(m) + "/" + Integer.toString(a);
        return date;
    }
}
