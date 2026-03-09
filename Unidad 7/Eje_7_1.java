import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author ECD
 * @input nada
 * @output sin salida específica
 */

public class Eje_7_1 {
    public static Boolean primo(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(i); i += 2) {
            if (i % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
            for (int f = 1; f <= 500; f++) {
                if (primo(f)) {
                    bw.write(f + "\n");
                }
            }
            bw.close();
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }

}
