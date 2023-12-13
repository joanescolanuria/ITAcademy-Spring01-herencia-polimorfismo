package n1ejercicio01;
public abstract class Instrumento {

		protected String nombre;
	    protected double precio;

	    public Instrumento(String nombre, double precio) {
	        this.nombre = nombre;
	        this.precio = precio;
	    }

	    public abstract void tocar();

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

	}