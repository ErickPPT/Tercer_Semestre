public class ProductoNacional extends Producto {
    /** Creacion del atributo impuesto nacional*/
    private double impuestoNacional=0.12;

    public ProductoNacional(int ID, String nombre, double precio, double precioCompra, int cantidadDisponible, int cantidadMinima, int diaReabastecimiento, int tiempoEntrega, int espacioMaximo, int tipo) {
        super(ID, nombre, precio, precioCompra, cantidadDisponible, cantidadMinima, diaReabastecimiento, tiempoEntrega, espacioMaximo, tipo);

    }

    public double calcularCostoreabastecimiento(int cantidad){
        double c=cantidad*getPrecioCompra();
        return c+c*impuestoNacional;
    }
}
