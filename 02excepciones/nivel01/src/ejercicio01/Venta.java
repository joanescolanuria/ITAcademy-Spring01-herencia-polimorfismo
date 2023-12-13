package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Venta {

	private ArrayList<Producto> productos;
	private double precioTotalVenta;

	public Venta(ArrayList<Producto> productos, double precioTotalVenta) {
		this.productos = productos;
		this.precioTotalVenta = precioTotalVenta;
	}
	public Venta() {
	    this.productos = new ArrayList<>();
	    this.precioTotalVenta = 0.0;
	}
	public List<Producto> getProductos() {
		return productos;
	}

	

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public double getPrecioTotalVenta() {
		return precioTotalVenta;
	}

	public double setPrecioTotalVenta(double precioTotalVenta) {
		return this.precioTotalVenta = precioTotalVenta;
	}

	public double calcularTotal() throws VentaBuidaException {
	    if (productos.isEmpty()) {
	        throw new VentaBuidaException();
	    }

	    double total = 0.0;
	    for (Producto producto : productos) {
	        total = total +  producto.getPrecio();
	    }

	    this.precioTotalVenta = total;
	    return total;
	}

}
