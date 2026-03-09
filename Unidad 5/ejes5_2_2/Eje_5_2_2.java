package ejes5_2_2;

import java.util.Scanner;

/**
 * Cambia el programa anterior de tal forma que los datos de los gatos se
 * introduzcan directamente en el código de la forma
 * gatito[2].setColor("marrón") o
 * bien mediante el constructor, de la forma gatito[3] = new Gato("Garfield",
 * "naranja",
 * "macho"). Muestra a continuación los datos de todos los gatos utilizando un
 * bucle.
 * 
 * @author ECD
 * @input nada
 * @output los valores resultado de las opciones pedidas en el ejercicio
 * 
 * 
 */
public class Eje_5_2_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Gato[] g1 = new Gato[10];
        String ele;
        boolean f = true;
        for (int i = 0; i < g1.length; i++) {
            f = true;
            g1[i] = new Gato();
            System.out.println("Para el gato Nº: " + (i + 1) + " ¿Que nombre tiene?");
            ele = s.nextLine();
            g1[i].setNombre(ele);
            do {
                System.out.println("¿Y que Sexo? (hembra/macho/ambos)");
                ele = s.nextLine();
                if (ele.equals("macho")) {
                    g1[i].setSexo("macho");
                    f = true;
                } else if (ele.equals("ambos")) {
                    g1[i].setSexo("ambos");
                    f = true;
                } else if (ele.equals("hembra")) {
                    g1[i].setSexo("hembra");
                    f = true;
                } else {
                    System.out.println("Tiene que ser \"hembra/macho/ambos\"");
                    f = false;
                }
            } while (!f);
        }

        for (int i = 0; i < g1.length; i++) {
            System.out.println(g1[i]);
        }
        s.close();
    }

}
