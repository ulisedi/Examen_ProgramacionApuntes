package ejes5_16;

/**
 * modificar el ejercicio anterior para que podamos, introduccir tambien una
 * variable, de tipo de tarifa
 * y luego hacer un nuevo metodo de "llamada" para que tambien calcule lo
 * tarifado segun la tarifa del movil.
 * 
 * @author ECD
 * @input nada
 * @output los valores resultado de las opciones pedidas en el ejercicio
 * 
 * 
 */
public class Eje_5_16 {

    public static void main(String[] args) {
        Punto p1 = new Punto(4.21, 7.3);
        Punto p2 = new Punto(-2, 1.66);
        Linea l = new Linea(p1, p2);
        System.out.println(l); 
    }


}
