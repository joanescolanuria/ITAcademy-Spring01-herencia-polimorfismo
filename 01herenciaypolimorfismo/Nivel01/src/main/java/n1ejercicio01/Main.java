package n1ejercicio01;

public class Main {
	public static void main(String[] args) {

		InstrumentoViento flauta = new InstrumentoViento("Saxofon", 20);
		InstrumentoCuerda guitarra = new InstrumentoCuerda("Gitarra", 300);
		InstrumentoPercusion bateria = new InstrumentoPercusion("Bombos", 250);
		
		flauta.tocar();
		guitarra.tocar();
		bateria.tocar();
	}
}
