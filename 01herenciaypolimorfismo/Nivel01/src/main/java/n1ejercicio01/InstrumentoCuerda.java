package n1ejercicio01;

public class InstrumentoCuerda extends Instrumento{
	
	static {
		System.out.println("Estatico de instrumento de cuerda");
	}

	public InstrumentoCuerda(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public void tocar() {
		System.out.println("Está sonando un instrumento de cuerda de nombre: " + nombre + " con precio: " + precio);
	}

}
