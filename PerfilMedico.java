import java.time.LocalDate;

public class PerfilMedico {
    /** Creacion de atributos*/
    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private double altura;
    private double peso;

    /** Constructores*/
    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int anio, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }

    /** Metodos propios de Java*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calculoEdad(){
        LocalDate hoy = LocalDate.now();
        int edad = hoy.getYear() - anio;
        if (hoy.getMonthValue() < mes ||
                (hoy.getMonthValue() == mes && hoy.getDayOfMonth() < dia)) {
            edad--;
        }
        return edad;
    }
    public int frecuenciaCardiacamaxima(){
        return 220-calculoEdad();
    }

    public String frecuenciaEsperada(){
        double frecuencia = frecuenciaCardiacamaxima();
        double max;
        double min;
        max= frecuencia*0.85;
        min= frecuencia*0.5;
        return "Entre " + Double.toString(min) + " a " + Double.toString(max) + " pulsaciones por minuto";
    }

    public Double imc(){
        double imc;
        altura=altura/100;
        imc=peso/(altura*altura);
        return imc;
    }

    public String clasificacionIMC(double imc){
        String clasi="";
        if (imc< 18.5){
            clasi=" Bajo peso";
        }else if (imc < 25) {
            clasi="Clasificación: Normal";
        } else if (imc < 30) {
            clasi = "Clasificación: Sobrepeso";
        } else if (imc>30){
            clasi = "Clasificación: Obesidad";
        }
        return clasi;
    }

    public String detalle (String n, String a, String s, int d, int m, int an, double al, double p, double imc){
        String de;
        de="Nombre del paciente: " + n + "\n" +
            "Apellido del paciente: " + a + "\n"+
            "Fecha de nacimiento: " + Integer.toString(d) + "/"+ Integer.toString(m) + "/" + Integer.toString(an) + "\n"+
            "Edad del paciente: " + calculoEdad() + "\n" +
            "Sexo del paciente: " + s + "\n"+
            "Altura del paciente: " + Double.toString(al) + "\n" +
            "Peso del paciente: " + Double.toString(p) + "\n"+
            "Frecuencia cardiaca maxima: " + frecuenciaCardiacamaxima() + "\n" +
            "Rango de frecuencia cardiaca: " + frecuenciaEsperada() + "\n" +
            "IMC del paciente: " + Double.toString(imc) + "\n"+
            "Clasificacion del IMC del paciente: " + clasificacionIMC(imc) + "\n";
        return de;
    }
}
