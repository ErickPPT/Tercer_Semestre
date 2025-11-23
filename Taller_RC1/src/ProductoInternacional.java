public class ProductoInternacional extends Producto {
    /** Creacion del atributo impuesto internacional*/

    private double impuestoInternacional=0.20;

    /** Constructor*/

    public ProductoInternacional(int ID, String nombre, double precioCompra, double precio, int espacioMaximo, int cantidadDisponible, int cantidadMinima, int diaReabastecimiento, int tiempoEntrega, int tipo) {
        super(ID, nombre, precioCompra, precio, espacioMaximo, cantidadDisponible, cantidadMinima, diaReabastecimiento, tiempoEntrega, tipo);
    }

    /** Metodo propio del autor*/
    public double calcularCostoreabastecimiento(int cantidad){
        double c=cantidad*getPrecioCompra();
        return c+c*impuestoInternacional;
    }
}
