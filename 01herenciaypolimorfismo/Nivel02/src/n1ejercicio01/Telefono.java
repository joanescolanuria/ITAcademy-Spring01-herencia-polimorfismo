package n1ejercicio01;

public class Telefono {

	String marca;
	String modelo;
	
	/**
	 * 
	 * Este método debe recibir un String con un número de teléfono. 
	 * El método debe mostrar por consola un mensaje diciendo que se 
	 * está llamando al número recibido por parámetro.
	 * @param numeroTelefono
	 * @return
	 */
	public void llamar(String numeroTelefono) {
		System.out.println("Se esta llamando: " + numeroTelefono);
	}
}
