public abstract class Producto {
    /** Creacion de los atributos*/
    private int ID;
    private String nombre;
    private double precio;
    private double precioCompra;
    private int cantidadDisponible;
    private int cantidadMinima;
    private int diaReabastecimiento;
    private int tiempoEntrega;
    private int espacioMaximo;
    private int tipo;

    public Producto(int ID, String nombre, double precio, double precioCompra, int cantidadDisponible, int cantidadMinima, int diaReabastecimiento, int tiempoEntrega, int espacioMaximo,int tipo) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.precioCompra = precioCompra;
        this.cantidadDisponible = cantidadDisponible;
        this.cantidadMinima = cantidadMinima;
        this.diaReabastecimiento = diaReabastecimiento;
        this.tiempoEntrega = tiempoEntrega;
        this.espacioMaximo = espacioMaximo;
        this.tipo = tipo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public int getDiaReabastecimiento() {
        return diaReabastecimiento;
    }

    public void setDiaReabastecimiento(int diaReabastecimiento) {
        this.diaReabastecimiento = diaReabastecimiento;
    }

    public int getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(int tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    public int getEspacioMaximo() {
        return espacioMaximo;
    }

    public void setEspacioMaximo(int espacioMaximo) {
        this.espacioMaximo = espacioMaximo;
    }

    public boolean alerta(){
        return cantidadDisponible<cantidadMinima;
    }
    public int espacioDisponible(){
        return espacioMaximo-cantidadDisponible;
    }

    public abstract double calcularCostoreabastecimiento(int cantidad);


    @Override
    public String toString() {
        return "Producto:" + "\n"+
                "ID:" + ID +  "\n"+
                "Nombre: " + nombre  + "\n"+
                "Precio de venta: " + precio + "\n"+
                "Precio de compra: " + precioCompra + "\n"+
                "Cantidad Disponible: " + cantidadDisponible + "\n"+
                "Cantidad Minima: " + cantidadMinima + "\n"+
                "Dia de reabastecimiento: " + diaReabastecimiento + "\n"+
                "Tiempo de entrega: " + tiempoEntrega + " dias"+"\n"+
                "Espacio maximo: " + espacioMaximo + "\n"+
                "Tipo (1)Nacinal, (2)Internacional: "+ tipo;
    }
}
