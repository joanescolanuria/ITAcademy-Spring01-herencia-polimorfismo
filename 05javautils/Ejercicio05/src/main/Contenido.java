package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Contenido {
	/*
	 * Crea una classe que llisti alfabèticament el contingut d'un directori rebut
	 * per paràmetre .
	 */
	public static void main(String[] arg) throws IOException, ClassNotFoundException {

		ArrayList<String> ordenar = new ArrayList<>();

		try (FileReader fr = new FileReader("C:/Users/Joan/Downloads/BaseDeDatos/Ejercicio05/src/main/documento.txt")) {
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				ordenar.add(linea);
			}

			// Ordenar alfabéticamente
			Collections.sort(ordenar);

			// Imprimir contenido ordenado
			System.out.println("Documento ordenado alfabéticamente: ");
			for (String ordenado : ordenar) {
				System.out.println(ordenado);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// Ejercicio 02
		/*
		 * Añade a la clase del ejercicio anterior, la funcionalidad de listar un árbol
		 * de directorios con el contenido de todos sus niveles (recursivamente) de
		 * manera que se impriman en pantalla en orden alfabético dentro de cada nivel,
		 * indicando además si es un directorio (D) o un fichero (F), y su última fecha
		 * de modificación.
		 */
		File carpeta = new File("C:/Users/Joan/Downloads/BaseDeDatos/Ejercicio05/src/main/");

		// Fichero donde guardaremos los resultados
		String resultadoFichero = "C:/Users/Joan/Downloads/BaseDeDatos/Ejercicio05/src/resultadofichero.txt";
		try (BufferedWriter fichero = new BufferedWriter(new FileWriter(resultadoFichero))) {

			File[] contenido = carpeta.listFiles();

			if (contenido != null) {

				for (File elemento : contenido) {

					if (elemento.isDirectory()) {
						fichero.write("D: " + elemento.getName() + "\n");

						File[] subContenido = elemento.listFiles();
						if (subContenido != null) {
							for (File subElemento : subContenido) {
								fichero.write("  F: " + subElemento.getName() + "\n");
								fichero.write(" Última modificación: " + new Date(subElemento.lastModified()) + "\n");

							}
						}
					} else {
						fichero.write("F: " + elemento.getName() + "\n");
						fichero.write("  Última modificación:" + new Date(elemento.lastModified()) + "\n");

					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * Añade la funcionalidad de leer cualquier fichero TXT y muestra su contenido
		 * por consola.
		 */
		FileReader fr = new FileReader("C:/Users/Joan/Downloads/BaseDeDatos/Ejercicio05/src/main/leerporconsola.txt");

		BufferedReader br = new BufferedReader(fr);
		String linea;
		System.out.println("Leer por consola:");
		while ((linea = br.readLine()) != null) {
			System.out.println(linea);
		}

		// Ejercicio 4: Serializar y deserializar un objeto Java
		// Creamos un objeto para serializar
		Serializado objetoOriginal = new Serializado("Serializado", 2103);

		// Serializamos el objeto en un archivo .ser
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:/Users/Joan/Downloads/BaseDeDatos/Ejercicio05/src/main/objeto.ser"));
		oos.writeObject(objetoOriginal);
		oos.close();

		// Deserializamos el objeto desde el archivo .ser
		ObjectInputStream serializacion = new ObjectInputStream(
				new FileInputStream("C:/Users/Joan/Downloads/BaseDeDatos/Ejercicio05/src/main/objeto.ser"));
		Serializado objetoDeserializado = (Serializado) serializacion.readObject();
		serializacion.close();

		// Mostramos la información del objeto deserializado
		System.out.println("Objeto deserializado: " + objetoDeserializado);

	}
}

class Serializado implements Serializable {
	private String nombre;
	private int valor;

	public Serializado(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "nombre: "  + nombre  + " , valor: " + valor;
	}
}