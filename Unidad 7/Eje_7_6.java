import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos
 * 
 * @author ECD
 * @input los nombres de los archivos pasados por consola
 * @output mensaje de salida dependiendo si ha dado error o no
 */

public class Eje_7_6 {
    public static void main(String[] args) {
        try {
            String fichero1 = args[0];
            String palabra = args[1];
            BufferedReader reader = new BufferedReader(new FileReader(fichero1));
            String linea = "";
            int rep = 0;
            System.out.println("\n Contando las veces que aparece " + palabra + " :");
            while (linea != null) {

                String[] palabras = linea.toLowerCase().trim().replaceAll("[^\\p{L}\\p{Nd}]+", " ").toLowerCase()
                        .split("\\s+");
                linea = reader.readLine();
                for (String p : palabras) {
                    if (p.equals(palabra)) {
                        rep++;
                    }
                }

            }
            reader.close();
            System.out.println("\n La palabra: " + palabra + " se ha repetido " + rep + " veces");
        } catch (Exception e) {
            System.out.println("\n Ha habido un problema con el archivo dado");
        }

    }

}
