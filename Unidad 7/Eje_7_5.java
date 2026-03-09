import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Escribe un programa capaz de quitar los comentarios de un programa de Java.
 * 
 * @author ECD
 * @input los nombres de los archivos pasados por consola
 * @output mensaje de salida dependiendo si ha dado error o no
 */

public class Eje_7_5 {
    public static void main(String[] args) {
        try {
            String fichero1 = args[0];
            String ficheroDestino = args[1];
            BufferedReader reader = new BufferedReader(new FileReader(fichero1));
            BufferedWriter writer = new BufferedWriter(new FileWriter(ficheroDestino));
            String linea = "";
            System.out.println("\n Quitando los comentarios del fichero...");
            while (linea != null) {
                linea = reader.readLine();
                if (linea != null) {
                    String lineaSinComentarios = linea.replaceAll("//.*", "").replaceAll("/\\*.*?\\*/", "");
                    writer.write(lineaSinComentarios + "\n");
                }
            }
            reader.close();
            writer.close();
            System.out.println("\nArchivo " + ficheroDestino + " a sido creado satisfactoriamente.");
        } catch (Exception e) {
            System.out.println("\nHa habido un problema con el archivo dado");
        }

    }

}
