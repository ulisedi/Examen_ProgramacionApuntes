package ejes5_17;

/**
 * Sobre una pirámide se debe saber su altura y sobre un rectángulo se debe saber tanto la base como la
 * altura. Cada una de las clases debe tener un atributo de clase (static) que
 * lleve la cuenta de las pirámides y de los rectángulos creados
 * respectivamente. 
 * @author ECD
 * @input nada
 * @output los valores resultado de las opciones pedidas en el ejercicio
 * 
 * 
 */
public class Eje_5_17 {

    public static void main(String[] args) {
        Piramide p = new Piramide(4);
        Rectangulo r1 = new Rectangulo(4, 3);
        Rectangulo r2 = new Rectangulo(6, 2);
        System.out.println(p);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Pirámides creadas: " + Piramide.getPiramidesCreadas());
        System.out.println("Rectángulos creados: " + Rectangulo.getRectangulosCreados());
    }

}
