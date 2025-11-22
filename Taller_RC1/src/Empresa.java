import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    /** Creacion de los atributos*/
    private List<Producto> productos;
    private double presupuesto;

    public Empresa( double presupuesto) {
        this.productos = new ArrayList<>();
        this.presupuesto = presupuesto;

    }
    public boolean estaVacio() {
        return productos.isEmpty();
    }

    public Producto buscarId (int ID) {
        for (Producto p : productos) {
            if (p.getID() == ID) {
                return p;
            }
        }
        return null;
    }

    public int buscarIndicePorId(int id) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getID() == id) {
                return i;
            }
        }
        return -1;
    }

    public boolean registarProducto(Producto producto) {
        if(buscarId(producto.getID())!=null){
            System.out.println("El Id del producto ya existe");
            return false;
        }

        if (producto.getCantidadDisponible()>producto.getEspacioMaximo()) {
            System.out.println("No hay espacio suficiente para este producto");
            return false;
        }
        productos.add(producto);
        System.out.println("Producto registado exitosamente");

        return true;
    }

    public void mostrarProductosConAlertas() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }
        for (Producto producto : productos) {
            System.out.println(producto);
            System.out.println("Espacio disponible: "+producto.espacioDisponible());
            if (producto.alerta()) {
                System.out.println("ALERTA: La cantidad dispoible es menor a la permitida");
            }
        }
    }

    public void vender(int Id, int cantidad){
        double ganancia=0;
        Producto producto = buscarId(Id);
        if (producto==null) {
            System.out.println("El producto no existe");
            return;
        }
        if (producto.getCantidadDisponible()<cantidad) {
            System.out.println("No hay suficiente stock disponible para la venta");
            return;
        }
        ganancia=cantidad*producto.getPrecio();
        presupuesto+=ganancia;
        producto.setCantidadDisponible(producto.getCantidadDisponible()-cantidad);
        System.out.println("La venta se realizo con exito.");
        System.out.println("Cantidad disponible: "+producto.getCantidadDisponible());
        System.out.println("Presupuesto actual: "+presupuesto);
    }

    public void reabastecer(int Id, int cantidad, int diaActual){
        Producto producto = buscarId(Id);
        if (producto==null) {
            System.out.println("El producto no existe");
            return;
        }
        if (diaActual!=producto.getDiaReabastecimiento()) {
            System.out.println("Hoy no es dia de reabastecimiento");
            return;
        }
        if (producto.getCantidadDisponible()+cantidad>producto.getEspacioMaximo()) {
            System.out.println("No hay espacio suficiente para el producto");
            return;
        }
        double costo=producto.calcularCostoreabastecimiento(cantidad);
        producto.setCantidadDisponible(producto.getCantidadDisponible()+cantidad);
        presupuesto-=costo;
        System.out.println("La cantidad disponible actual es: "+producto.getCantidadDisponible());
        System.out.println("El espacio disponible es: "+producto.espacioDisponible());
        System.out.println("El presupuesto actual: "+presupuesto);
        System.out.println("El producto llegara en: "+producto.getTiempoEntrega()+" dias");
    }

    public void eliminar(int Id){
        int indice=buscarIndicePorId(Id);
        if (indice==-1) {
            System.out.println("Producto no encontrado");
            return;
        }
        productos.remove(indice);
        System.out.println("Producto eliminado exitosamente");

    }

    public void editar(int Id, Scanner sc){
        int indice=buscarIndicePorId(Id);
        if (indice==-1) {
            System.out.println("Producto no encontrado");
            return;
        }
        System.out.println("Editar producto con Id ("+Id+")");
        System.out.println("Nuevo nombre:");
        String nombre=sc.nextLine();

        System.out.println("Nuevo precio de compra:");
        double precioCompra=sc.nextInt();
        sc.nextLine();

        System.out.println("Nuevo de precio de venta:");
        double precioVenta=sc.nextInt();
        sc.nextLine();

        System.out.println("Nueva capacidad maxima:");
        int cantidadMaxima=sc.nextInt();
        sc.nextLine();

        System.out.println("Nueva cantidad disponible:");
        int cantidadDisponible=sc.nextInt();
        sc.nextLine();

        if (cantidadDisponible > cantidadMaxima) {
            System.out.println("Stock excede la capacidad máxima.");
            return;
        }

        System.out.println("Nueva cantida minima:");
        int cantidadMinima=sc.nextInt();
        sc.nextLine();

        System.out.println("Nuevo dia de reabastecimiento:");
        int diaReabastecimiento=sc.nextInt();
        sc.nextLine();

        System.out.println("Nuevo tiempo de entrega en dias:");
        int tiempoEntrega=sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese 1 si el producto es nacional o 2 si es internacional");
        int tipo=sc.nextInt();
        sc.nextLine();

        Producto nuevo=null;
        if (tipo==1){
            nuevo = new ProductoNacional(Id,nombre,precioVenta,precioCompra,cantidadMaxima,cantidadDisponible,cantidadMinima,diaReabastecimiento,tiempoEntrega,tipo);
        } else if (tipo==2) {
            nuevo = new ProductoInternacional(Id,nombre,precioVenta,precioCompra,cantidadMaxima,cantidadDisponible,cantidadMinima,diaReabastecimiento,tiempoEntrega,tipo);
        }

        productos.set(indice,nuevo);
        System.out.println("Producto editado con exito");

    }
}
