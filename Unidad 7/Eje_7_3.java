import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Escribe un programa que guarde en un fichero el contenido de otros dos
 * ficheros, de tal forma que en el fichero resultante aparezcan las líneas de
 * los
 * primeros dos ficheros mezcladas, es decir, la primera línea será del primer
 * fichero, la segunda será del segundo fichero, la tercera será la siguiente
 * del
 * primer fichero, etc.
 * Los nombres de los dos ficheros origen y el nombre del fichero destino se
 * deben
 * pasar como argumentos en la línea de comandos.
 * Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas
 * pueden tener tamaños diferentes.
 * 
 * @author ECD
 * @input los nombres de los archivos pasados por consola
 * @output mensaje de salida dependiendo si ha dado error o no
 */

public class Eje_7_3 {
    public static void main(String[] args) {

        try {
            String fichero1 = args[0];
            String fichero2 = args[1];
            String ficheroDestino = args[2];
            BufferedReader reader1 = new BufferedReader(new FileReader(fichero1));
            BufferedReader reader2 = new BufferedReader(new FileReader(fichero2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(ficheroDestino));
            String linea1 = "";
            String linea2 = "";
            System.out.println("\n Juntando los ficheros...");
            while (linea1 != null || linea2 != null) {
                linea1 = reader1.readLine();
                linea2 = reader2.readLine();
                if (linea1 != null) {
                    writer.write(linea1 + "\n");
                }
                if (linea2 != null) {
                    writer.write(linea2 + "\n");
                }
            }
            reader1.close();
            reader2.close();
            writer.close();
            System.out.println("\nArchivo " + ficheroDestino + "a sido creado satisfactoriamente.");
        } catch (Exception e) {
            System.out.println("No se han podido leer los archivos bien, el formato tiene que ser: ficheroLectura1  ficheroLectura2  ficheroEscritura");
        }

    }

}
