package ejes5_3;

public class Gato extends Mamifero {
   
     public Gato() {
        super();
    }

    public Gato(Sexo s, double e, double p, Alim a) {
        super(s, e, p, a);
    }

    public void maulla(){
        System.out.println("miao miao madafuka");
        System.out.println("-");

    }
    public void arraña(){
        System.out.println("vas a flipar con las cortinas");
        System.out.println("-");

    }
    public void mea(){
        System.out.println("--");
            System.out.println("Bua como me gusta mear porque si ");
            System.out.println("-");
    }

}
