package ejes5_3;

public class Pinguino extends Ave {
    public Pinguino() {
        super();
    }

    public Pinguino(Sexo s, double e, double p, Alim a) {
        super(s, e, p, a);
    }

    @Override
    public void vuela() {
        System.out.println(" yo no puedo volar, cabrón");
        System.out.println("-");
    }

    public void incuva() {

        if (this.getSexo() == Sexo.HEMBRA) {
            System.out.println("Bua que pereza que lo cuide el Padre");
            System.out.println("-");
        } else {
            System.out.println("Como la otra no quiere hacerlo, tenogo que pasar frio ;v");
            System.out.println("-");
        }

    }

    public void nada() {
        System.out.println("ahora no puedo, hay orcas en el agua");
        System.out.println("-");
    }
}
