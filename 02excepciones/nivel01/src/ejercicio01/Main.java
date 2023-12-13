package ejercicio01;


public class Main {

    public static void main(String[] args) throws VentaBuidaException {
        Venta venta1 = new Venta();

        Producto producto1 = new Producto("televisor", 21);
        Producto producto2 = new Producto("silla", 21);
        
        
        venta1.getProductos().add(producto1);
        venta1.getProductos().add(producto2);
 
        
        System.out.println("Precio total de la venta: " + venta1.calcularTotal());

        try {
            venta1.calcularTotal();
        } catch (VentaBuidaException e) {
            e.printStackTrace();
        }
    }
}
