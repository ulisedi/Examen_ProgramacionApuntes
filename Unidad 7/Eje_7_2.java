import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que 
muestre los números por pantalla. 
 * 
 * @author ECD
 * @input nada
 * @output valores de el archivo primos.dat
 */

public class Eje_7_2 {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
            String linea = "";
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        } catch (IOException ioe) {
            System.out.println("No se ha podido leer en el fichero");
        }
    }

}
