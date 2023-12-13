package n1ejercicio01;

public class Smartphone extends Telefono implements ICamara, IReloj {

	/**
	 * Crea una clase llamada "Smartphone" que sea subclase de "Teléfono"
	 *  y que a la vez implemente las interfaces "Camera" y "Reloj".
	 */
	
	@Override
	public String alarma() {
		// TODO Auto-generated method stub
		return "Está sonando la alarma";
	}

	@Override
	public String fotografiar() {
		// TODO Auto-generated method stub
		return "Se está haciendo una foto";
	}

	
	
}
