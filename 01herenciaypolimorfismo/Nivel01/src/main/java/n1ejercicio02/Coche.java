package n1ejercicio02;

public class Coche {

	protected static final String marca = "Seat";
	static String modelo;
	private final int potencia;
	
	//Desde el constructor se inicia la potencia
	public Coche(int potencia) {
		this.potencia = potencia;
	}
	
	public static void frenar() {
		System.out.println("El vehiculo esta frenando");
	}
	public void acelerar() {
		System.out.println("El vehiculo esta acelerando y tiene una potencia de : " + potencia  );
	}

	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public static String getMarca() {
		return marca;
	}

	public int getPotencia() {
		return potencia;
	}	
	
}
