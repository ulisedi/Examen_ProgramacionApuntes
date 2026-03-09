package ejes5_3;

import java.util.Scanner;

import ejes5_3.Animal.Alim;
import ejes5_3.Animal.Sexo;

/**
 * crear las clases Animal mamifero ave gato perro canario pinguino y lagarto, y
 * tres metodos en cada. Luego probarlas
 * 
 * @author ECD
 * @input  nada
 * @output los valores resultado de las funciones usadas
 * 
 * 
 */
public class Eje_5_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Perro pip = new Perro(Sexo.MACHO, 2, 3, Alim.OMNI);
        Perro pip2 = new Perro(Sexo.MACHO, 2, 3, Alim.OMNI);
        Canario man = new Canario(Sexo.MACHO, 2.3, 0.1, Alim.PLANTAS);
        Canario man2 = new Canario(Sexo.HEMBRA, 2.3, 0.1, Alim.CARNE);
        Gato misi = new Gato(Sexo.HEMBRA, 0, 0, Alim.OMNI);
        Pinguino p1 = new Pinguino();
        Lagarto L1 = new Lagarto(Sexo.HEMBRA, 4.2, 0.123, Alim.CARNE);
        pip.come();
        pip2.come();
        pip2.peleaCon(pip);
        man.aparea(man2);
        man.ponHuevo();
        man2.ponHuevo();
        misi.arraña();
        p1.vuela();
        L1.desayuna();

        s.close();
    }

}
