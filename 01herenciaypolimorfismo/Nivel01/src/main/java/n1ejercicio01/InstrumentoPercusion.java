package n1ejercicio01;

public class InstrumentoPercusion extends Instrumento {

	// Constructor
	public InstrumentoPercusion(String nombre, double precio) {
		super(nombre, precio);
	}

	static {
		System.out.println("Estatico de Instrumento de percusion" );
	}

	// Implementación del método tocar()
	@Override
	public void tocar() {
		System.out.println("Está sonando un instrumento de percusión de nombre: " + nombre + " con precio: " + precio);
	}
	
	
}
