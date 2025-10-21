import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /** Creacion de objeto*/
        FrecuenciaCardiaca persona = new FrecuenciaCardiaca("", "", 0, 0, 0);
        Scanner sc = new Scanner(System.in);

        /** Ingreso de datos*/
        System.out.println("Ingrese el nombre de la persona: ");
        persona.setNombre(sc.nextLine());
        System.out.println();
        System.out.println("Ingrese el apellido de la persona: ");
        persona.setApellido(sc.nextLine());
        System.out.println();
        System.out.println("Ingrese el dia de nacimiento: ");
        persona.setDia(sc.nextInt());
        System.out.println();
        System.out.println("Ingrese el mes de nacimiento: ");
        persona.setMes(sc.nextInt());
        System.out.println();
        System.out.println("Ingrese el año de nacimiento");
        persona.setAnio(sc.nextInt());

        /** Despliegue los datos*/
        System.out.println(persona.mostrarDatos(persona.getNombre(), persona.getApellido(), persona.getDia(), persona.getMes(), persona.getAnio(), persona.calculoEdad(), persona.frecuenciaEsperada()));
    }
}