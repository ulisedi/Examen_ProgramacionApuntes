/**
 * crea tres instancias de caballo, y aplica algunos metodos
 * 
 *  @author ECD
 *  @input  nada
 *  @output la salida de los metodos que se pide 
 * 
 * 
 *  */



package ejes5_1;

public class Eje_5_1 {

    public static void main(String[] args) {
        Caballo prim = new Caballo("Pablo", 'M');
        Caballo seg = new Caballo("Fermina", 'H');
        Caballo terc = new Caballo("Amador", 'M');
        System.out.println(prim);
        System.out.println(seg);
        System.out.println(terc);
        prim.correr();
        terc.comer("zanahoria");
        seg.comer("manzana");
        seg.saltar();



    }

}
