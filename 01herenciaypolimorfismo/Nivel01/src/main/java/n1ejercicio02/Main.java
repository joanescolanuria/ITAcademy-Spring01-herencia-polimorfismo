package n1ejercicio02;

public class Main {


	public static void main(String[] args) {

		Coche coche1 = new Coche(50);
		Coche.setModelo("Ibiza");
		
		System.out.println("El coche es de marca: " + Coche.marca + " y el modelo es: " + Coche.modelo);
		Coche.frenar();
		coche1.acelerar();
		/*
		 * 
		 * ¿Hay alguno que se pueda inicializar al constructor de la clase?
		 * Solo POTENCIA
		 */
	
	}
}
