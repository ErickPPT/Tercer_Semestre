import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /** Creacion de objetos*/
        Factura art = new Factura("", "", 0, 0.0);

        /** Entrada de datos*/
        art.setNumeroPieza(JOptionPane.showInputDialog("Ingresa el numero de piezas: "));
        art.setDescripcion(JOptionPane.showInputDialog("Ingresa la descripcion: "));
        art.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad: ")));
        art.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingresa la precio: ")));

        /** Logica*/
        if (art.getCantidad() < 0){
            art.setCantidad(0);
        }
        if (art.getPrecio() < 0){
            art.setPrecio(0.0);
        }
        /** Despliegue*/
        System.out.println("Datos de facturacion:");
        System.out.println(art.detalleFactura(art.getNumeroPieza(), art.getDescripcion(), art.getPrecio(), art.getCantidad()));

    }
}