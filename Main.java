import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /** Creacion de objetos de la clase empleado*/
        Empleado e1 = new Empleado("","",0.0);
        Empleado e2 = new Empleado("","",0.0);

        /** Leer los valores de cada empleado*/
        /** Empleado 1*/
        e1.setPrimerNombre(JOptionPane.showInputDialog("Primer Nombre : "));
        e1.setApellidoPaterno(JOptionPane.showInputDialog("Apellido Paterno : "));
        e1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salario : ")));

        /** Empleado 2*/
        e2.setPrimerNombre(JOptionPane.showInputDialog("Primer Nombre : "));
        e2.setApellidoPaterno(JOptionPane.showInputDialog("Apellido Paterno : "));
        e2.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salario : ")));

        /** Logica*/
        if (e1.getSalario() < 0) {
            e1.setSalario(0.0);
        }
        if (e2.getSalario() < 0) {
            e2.setSalario(0.0);
        }

        /** Llamada al metodo y despliegue*/
        System.out.println("Detalle Empleado 1:");
        System.out.println(e1.detalleEmpleado(e1.getPrimerNombre(), e1.getApellidoPaterno(), e1.getSalario()));
        System.out.println();
        System.out.println("Detalle Empleado 2:");
        System.out.println(e2.detalleEmpleado(e2.getPrimerNombre(), e2.getApellidoPaterno(), e2.getSalario()));
        System.out.println();

        e1.aumentoSalario(10);
        e2.aumentoSalario(10);

        System.out.println("Salario luego del aumento del 10%");
        System.out.println(e1.detalleEmpleado(e1.getPrimerNombre(), e1.getApellidoPaterno(), e1.getSalario()));
        System.out.println();
        System.out.println("Detalle Empleado 2:");
        System.out.println(e2.detalleEmpleado(e2.getPrimerNombre(), e2.getApellidoPaterno(), e2.getSalario()));

    }
}