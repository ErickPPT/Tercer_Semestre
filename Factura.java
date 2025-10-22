
public class Factura {

    /**Creacion de los atributos*/
    private String numeroPieza;
    private String descripcion;
    private int cantidad;
    private double precio;

    /** Contructores y destructores*/
    public Factura(String numeroPieza, String descripcion, int cantidad, double precio) {
        this.numeroPieza = numeroPieza;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;

    }
    /** Metodos propios de Java*/
    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /** Metodos propios del programador*/
    public double obtenerMontofactura(){
        return precio*cantidad;
    }

    public String detalleFactura(String np, String d, double pr, int ca){
        String detalle;
        detalle= "Numero de pieza : " + np  + "\n" +
                "Descripcion : " + d + "\n" +
                "Precio : " + Double.toString(pr) + "\n" +
                "Cantidad : " + Integer.toString(ca) + "\n" +
                "Monto a pagar : " + obtenerMontofactura();
        return detalle;
    }
}
