import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre
 * del fichero resultado debe ser el mismo que el original añadiendo la
 * coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea
 * 
 * @author ECD
 * @input los nombres de los archivos pasados por consola
 * @output nada
 */

//dfgsdfhgsdghsghsxhrthsdrthdrhhththbrhtrh
    //dfgsdfhgsdghsghsxhrthsdrthdrhhththbrhtrh
    
public class hola {
    public static void main(String[] args) {

        try {
            String fichero1 = args[0];
            String ficheroDestino = args[0].replace(".txt", "_nocomms.txt");
            BufferedReader reader1 = new BufferedReader(new FileReader(fichero1));
            BufferedWriter writer = new BufferedWriter(new FileWriter(ficheroDestino));
            String linea1 = "";
            ArrayList<String> palabras = new ArrayList<String>();
            System.out.println("\n Ordenando el ficheros...");
            while (linea1 != null) {
                palabras.add(linea1);
                linea1 = reader1.readLine();
            }
            Collections.sort(palabras);
            for (String pOrdenada : palabras) {
                writer.write(pOrdenada + "\n");
            }

            reader1.close();
            writer.close();
            System.out.println("\nArchivo " + ficheroDestino + "a sido creado satisfactoriamente.");
        } catch (Exception e) {
            System.out.println( "Ha Habido un problema con el archivo dado");
        }

    }
    //dfgsdfhgsdghsghsxhrthsdrthdrhhththbrhtrh
    //dfgsdfhgsdghsghsxhrthsdrthdrhhththbrhtrh
    
    
}
