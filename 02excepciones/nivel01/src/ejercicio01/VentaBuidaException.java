package ejercicio01;

public class VentaBuidaException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public VentaBuidaException() {
		super("Para hacer una venta primero tienes que añadir productos");
	}
	
	
	
}
