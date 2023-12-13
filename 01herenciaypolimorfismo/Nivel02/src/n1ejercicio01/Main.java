package n1ejercicio01;

public class Main {
	
	
	public static void main(String[] args) {

		Telefono telefono1 = new Telefono();
		telefono1.llamar("69425422");
		
		/*
		 * Desde el main() de la aplicación, 
		 * crea un objeto Smartphone 
		 * y llama a los métodos anteriores.
		 */
		Smartphone smartphone1 = new Smartphone();
	
		System.out.println(smartphone1.alarma());
		System.out.println(smartphone1.fotografiar());
}
}
