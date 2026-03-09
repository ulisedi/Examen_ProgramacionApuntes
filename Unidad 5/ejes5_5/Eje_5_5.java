package ejes5_5;
/**
 * crear la calse pizza con las variables tamaño, tipo, estado. con default de estado a pedida. la clase debe almacenar 
 * la cantidad de pizzas servidas y pedidas.
 * 
 * @author ECD
 * @input nada
 * @output los valores resultado de las opciones
 * 
 * 
 */
public class Eje_5_5 {

    public static void main(String[] args) {

        Pizza p1 = new Pizza("mediana","margarita");
        Pizza p2 = new Pizza("familiar","funghi");
        p2.sirve();
        Pizza p3 = new Pizza("mediana", "cuatro quesos");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("Pedidas: "+ Pizza.getPedidas());
        System.out.println("Servidas: "+ Pizza.getServidas());




      
    }
}
