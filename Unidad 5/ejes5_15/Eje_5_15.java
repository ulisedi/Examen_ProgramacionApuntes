package ejes5_15;

/**
 * Utiliza la clase anterior para generar una secuencia de 8 fichas creadas de
 * forma aleatoria, que encajen bien y que estén bien colocadas según el juego
 * del dominó. No hay que controlar si se repiten o no las fichas.
 * 
 * @author ECD
 * @input nada
 * @output los valores resultado de las opciones pedidas en el ejercicio
 * 
 * 
 */
public class Eje_5_15 {

    public static void main(String[] args) {
        FichaDomino[] a1 = new FichaDomino[8];
        a1[0] = new FichaDomino();

        for (int i = 1; i < a1.length; i++) {
            a1[i] = new FichaDomino();

            while (!(a1[i].encaja(a1[i - 1]) && (a1[i - 1].getn2() == a1[i].getn1()))) {
                a1[i] = new FichaDomino();
            }

        }
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + ",");
        }
    }

}
