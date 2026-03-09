package ejes5_8;
/**
 * nos dan un main especifico, hay que crear 2 variables el numero (String) y 
 * el tiempo de conversacion (int) si llamamos al metodo "llama" tendra que sumar en los dos 
 * los segundos dados en "llama" y con un formato gracias al toString.
 * @author ECD
 * @input  nada
 * @output los valores resultado de las opciones pedidas en el ejercicio
 */
public class Eje_5_8 {

    public static void main(String[] args) {
        Terminal t1 = new Terminal("678 11 22 33");
        Terminal t2 = new Terminal("644 74 44 69");
        Terminal t3 = new Terminal("622 32 89 09");
        Terminal t4 = new Terminal("664 73 98 18");
        System.out.println(t1);
        System.out.println(t2);
        t1.llama(t2, 320);
        t1.llama(t3, 200);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

    }
}
