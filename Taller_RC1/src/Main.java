import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Empresa empresa = new Empresa( 5000.0);
    Scanner sc = new Scanner(System.in);

    int opcion;

    do{
        System.out.println("===INVENTARIO===");
        System.out.println("1. Registrar producto");
        System.out.println("2. Ver productos y alertas");
        System.out.println("3. Editar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Vender producto");
        System.out.println("6. Reabastecer producto");
        System.out.println("7. Salir");
        System.out.println("Selecciona una opcion: ");
        opcion = sc.nextInt();

        switch(opcion){
            case 1:
                System.out.println("REGISTRAR PRODUCTO");
                System.out.println("Ingrese el Id del producto: ");
                int Id= sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese el nombre del producto: ");
                String nombre= sc.nextLine();

                System.out.println("Ingrese el precio de compra del producto");
                double precioCompra=sc.nextDouble();
                sc.nextLine();

                System.out.println("Ingrese el precio de venta del producto");
                double precio=sc.nextDouble();
                sc.nextLine();

                System.out.println("Ingrese la capacidad maxima del producto");
                int espacioMaximo=sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese la cantidad disponible del producto");
                int cantidadDisponible=sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese la cantidad minima permitida");
                int cantidadMinima=sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese el dia de reabastecimiento");
                int diaReabastecimiento=sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese el tiempo de entrega en dias");
                int tiempoEntrega=sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese 1 si el producto es nacional o 2 si es internacional");
                int tipo=sc.nextInt();


                if(tipo==1){
                    empresa.registarProducto(new ProductoNacional(Id,nombre,precio,precioCompra,cantidadDisponible,cantidadMinima,diaReabastecimiento, tiempoEntrega, espacioMaximo,tipo));
                }else if(tipo==2) {
                    empresa.registarProducto(new ProductoInternacional(Id,nombre,precio,precioCompra,cantidadDisponible,cantidadMinima,diaReabastecimiento, tiempoEntrega, espacioMaximo,tipo));
                }

                break;
            case 2:
                empresa.mostrarProductosConAlertas();

                break;
            case 3:
                if (empresa.estaVacio()) {
                    System.out.println("No se han registrado productos aún.");
                    break;
                }
                System.out.println("Ingrese el Id del producto a editar:");
                int idEditar= sc.nextInt();
                empresa.editar(idEditar,sc);
                break;
            case 4:
                if (empresa.estaVacio()) {
                    System.out.println("No se han registrado productos aún.");
                    break;
                }
                System.out.println("Ingrese el Id del producto que desee eliminar");
                int idEliminar=sc.nextInt();
                sc.nextLine();
                empresa.eliminar(idEliminar);
                break;
            case 5:
                if (empresa.estaVacio()) {
                    System.out.println("No se han registrado productos aún.");
                    break;
                }
                System.out.println("Ingrese el Id del producto a vender:");
                int id=sc.nextInt();
                System.out.println("Ingrese la cantidad a vender:");
                int cantidadVender=sc.nextInt();
                empresa.vender(id,cantidadVender);
                break;
            case 6:
                if (empresa.estaVacio()) {
                    System.out.println("No se han registrado productos aún.");
                    break;
                }
                System.out.println("Ingrese el Id del producto a reabastecer:");
                int idReabastecer=sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese la cantidad del producto a reabastecer:");
                int cantidadReabastecer=sc.nextInt();
                int diaActual= LocalDate.now().getDayOfMonth();
                empresa.reabastecer(idReabastecer,cantidadReabastecer,diaActual);
                break;
            case 7:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                System.out.println("Opcion no valida");
        }

    }while (opcion !=7);
    }
}