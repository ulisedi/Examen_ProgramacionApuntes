package ejes5_6;

/**
 * crear la clase tiempo con los metodos resta y suma. Comprobar que funcionen
 * los metodos
 * 
 * @author ECD
 * @input nada
 * @output los valores resultado de las opciones
 * 
 * 
 */
public class Eje_5_6 {

    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(0, 30, 40);
        Tiempo t2 = new Tiempo(0, 35, 20);

        System.out.println("Suma de t1 y t2: " + t1.suma(t2));
        System.out.println("Resta de t1 y t2: " + t1.resta(t2));

    }
}
