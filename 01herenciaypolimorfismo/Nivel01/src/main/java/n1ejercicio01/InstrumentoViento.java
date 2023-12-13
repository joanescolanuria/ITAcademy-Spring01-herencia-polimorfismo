package n1ejercicio01;

	public class InstrumentoViento extends Instrumento{

		static {
			System.out.println("Estatico de instrumento de viento");
		}
		
	    // Constructor
	    public InstrumentoViento(String nombre, double precio) {
	        super(nombre, precio);
	    }

	    @Override
	    public void tocar() {
			System.out.println("Está sonando un instrumento de viento de nombre: " + nombre + " con precio: " + precio);
	    }
	}
