/**
 (La clase Empleado) Cree una clase llamada Empleado, que incluya tres variables de
 instancia: un primer nombre (tipo String), un apellido paterno (tipo String) y un
 salario mensual (double). Su clase debe tener un constructor que inicialice las tres variables
 de instancia. Proporcione un metodo establecer y un metodo obtener para cada variable de instancia.

 Si el salario mensual no es positivo, no establezca su valor. Escriba una aplicación de prueba llamada
 PruebaEmpleado, que demuestre las capacidades de la clase Empleado. Cree dos objetos Empleado y muestre
 el salario anual de cada objeto. Después, proporcione a cada Empleado un aumento del 10% y muestre el
 salario anual de cada Empleado otra vez.
 */
public class Empleado {
    /** Atributo de clase*/

    private String primerNombre;
    private String apellidoPaterno;
    private double salario;

    /** Constructores y destructores*/
    public Empleado(String primerNombre, String apellidoPaterno, double salario) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.salario = salario;
    }

    /** Metodos propios de Java*/
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String detalleEmpleado(String pn, String ap, double s){
        String de;
        de=  "Primer nombre    : " + pn + "\n" +
                        "Apellido paterno : " + ap + "\n" +
                        "Salario          : " + Double.toString(s);
        return de;
    }

    public void aumentoSalario(double aumento){
        salario=salario*(1+aumento/100);
    }
}
