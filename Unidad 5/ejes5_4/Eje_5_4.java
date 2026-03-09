package ejes5_4;
/**
 * crear la clase fraccion. luego crear algunos metodos y usarlos 
 * 
 * @author ECD
 * @input nada
 * @output los valores resultado de los metodos usados
 * 
 * 
 */
public class Eje_5_4 {

    public static void main(String[] args) {

        Fraccion a = new Fraccion(4, 6);
        Fraccion b = new Fraccion(2, 8);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("Dividir a entre b: " + a.dividide(b));
        System.out.println("Multiplicar a y b: " + a.multiplica(b));
        System.out.println("a invertida: " + a.invierte());
        System.out.println("b invertida: " + b.invierte());
        a.simplifica();
        b.simplifica();
        System.out.println("a simplificada: "+ a);
        System.out.println("b simplificada: "+ b);
    }
}