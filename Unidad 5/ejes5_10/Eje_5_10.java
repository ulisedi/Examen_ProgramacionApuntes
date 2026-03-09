package ejes5_10;

/**
 * Crea la clase Ameba con el atributo peso, un número entero que indica lo
 * que pesa el bicho. Cuando se crea una ameba de la
 * nada su peso es de 3 . Al comer, va incrementando
 * su peso; gasta un microgramo en el proceso de fagocitar y el resto hace que
 * aumente de peso. La ameba comida no se destruye sino
 * que se quedaría con un peso de 0 microgramos,
 * Posteriormente, una ameba comida podría recuperarse si ella misma come
 * algo.
 *  * @author ECD
 * @input nada
 * @output los valores resultado de las opciones pedidas en el ejercicio
 *  
 */
public class Eje_5_10 {

    public static void main(String[] args) {
        Ameba a1 = new Ameba();
        a1.come(2);
        System.out.println(a1);
        Ameba a2 = new Ameba();
        a2.come(4);
        System.out.println(a2);
        a1.come(a2);
        System.out.println(a1);
        System.out.println(a2);
        a2.come(3);
        System.out.println(a2);

    }
}
