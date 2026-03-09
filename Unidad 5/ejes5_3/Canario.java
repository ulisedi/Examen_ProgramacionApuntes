package ejes5_3;

public class Canario extends Ave {

    public Canario() {
        super(Sexo.MACHO, 0, 0, Alim.CARNE);
    }

    public Canario(Sexo s, double e, double p, Alim a) {
        super(s, e, p, a);
    }

    @Override
    public void vuela() {
        System.out.println("Literalmente estoy en una jaula, no puedo :c");
        System.out.println("-");
    }

    public void canta() {
        System.out.println("Pio Pio, mdfk");
        System.out.println("-");
    }

    public void picotear() {
        System.out.println("\" Voy a picotear la cabeza de mi dueño\"");
        System.out.println("-");
    }

    public void aparea(Canario s) {
        
        if (s.getSexo() != this.getSexo()) {
            System.out.println("Pues no queda de otra ^ ^");
              System.out.println("-");

        } else {
            System.out.println("no me gusta esas cosas ;c");
              System.out.println("-");
        }
    }

}
