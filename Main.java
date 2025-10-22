import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /** Creacion de objetos*/
        PerfilMedico perfil = new PerfilMedico("","","",0,0,0,0.0,0.0);

        /** Ingreso de datos*/
        perfil.setNombre(JOptionPane.showInputDialog("Nombre del paciente: "));
        perfil.setApellido(JOptionPane.showInputDialog("Apellido del paciente: "));
        perfil.setSexo(JOptionPane.showInputDialog("Sexo del paciente: "));
        perfil.setDia(Integer.parseInt(JOptionPane.showInputDialog("Dia de nacimiento del paciente: ")));
        perfil.setMes(Integer.parseInt(JOptionPane.showInputDialog("Mes nacimiento del paciente: ")));
        perfil.setAnio(Integer.parseInt(JOptionPane.showInputDialog("Año de nacimiento del paciente: ")));
        perfil.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura del paciente en cm: ")));
        perfil.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso del paciente en kg: ")));

        /** Despliegue*/
        System.out.println("Datos del paciente");
        System.out.println(perfil.detalle(perfil.getNombre(), perfil.getApellido(), perfil.getSexo(), perfil.getDia(), perfil.getMes(), perfil.getAnio(), perfil.getAltura(), perfil.getPeso(), perfil.imc()));


    }
}