package ejes5_3;

public class Lagarto extends Animal {
    public Lagarto() {
        super(Sexo.HEMBRA,0,0,Alim.CARNE);
    }

    public Lagarto(Sexo s, double e, double p, Alim a) {
        super(s, e, p, a);
    }

    public void desayuna() {
        System.out.println("Iguana, lagarto, desayuna con huvo, con pulpa, sin pulpa. Toma mango");
        System.out.println("-");
    }

    public void Mudar() {
        double año = this.getEdad();
        if (año <= 1) {
            System.out.println("Como me gusta cambiar de piel");
            System.out.println("-");
        } else {
            System.out.println("Espero que sea la última muda");
            System.out.println("-");
        }
    }

    public void tomaSol() {
        System.out.println("La roquita esta esta caliente");
        System.out.println("-");
    }

}
