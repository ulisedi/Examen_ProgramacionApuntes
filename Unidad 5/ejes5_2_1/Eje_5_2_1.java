package ejes5_2_1;
import java.util.Scanner;
/**
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los
 * datos
 * de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
 * todos los gatos utilizando también un bucle.
 * @author ECD
 * @input el nobre y el sexo de cada gato
 * @output los valores resultado de las opciones pedidas en el ejercicio
 */
public class Eje_5_2_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Gato[] g1 = new Gato[10];
        String ele;
        Boolean f = true;
        for (int i = 0; i < g1.length; i++) {
            f = true;
            g1[i] = new Gato();
            System.out.println("Para el gato Nº: " + (i + 1) + " ¿Que nombre tiene?");
            ele = s.nextLine();
            g1[i].setNombre(ele);
            System.out.println("¿Y que Sexo? (hembra/macho/ambos)");
            while (f) {
                try {
                    ele = s.nextLine();
                } catch (Exception e) {
                    System.out.println("Error en el volor introducido");
                    i--;
                    s.nextLine();
                    continue;
                }
                if (ele.equals("macho")) {
                    g1[i].setSexo(Gato.Sexo.MACHO);
                    f = false;
                } else if (ele.equals("ambos")) {
                    g1[i].setSexo(Gato.Sexo.AMBOS);
                    f = false;
                } else if (ele.equals("hembra")) {
                    g1[i].setSexo(Gato.Sexo.HEMBRA);
                    f = false;
                } else {
                    System.out.println("Tiene que ser (hembra/macho/ambos)");
                }
            }

        }

        for (int i = 0; i < g1.length; i++) {
            System.out.println(g1[i]);
        }
        s.close();
    }

}
