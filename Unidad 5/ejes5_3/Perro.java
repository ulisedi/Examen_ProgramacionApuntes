package ejes5_3;

public class Perro extends Mamifero {

    public Perro() {
        super();
    }

    public Perro(Sexo s, double e, double p, Alim a) {
        super(s, e, p, a);
    }

    

    public void ladra() {
        System.out.println("Bark bark");
        System.out.println("-");

    }

    @Override
    public void come() {
        System.out.println("Espero que me des algo de carne ><");
        System.out.println("-");
    }

    public void peleaCon(Perro s) {
        switch (s.getSexo()) {
            case MACHO:
                if (this.getSexo().equals(s.getSexo())) {
                    System.out.println("Le voy a reventar");
                    System.out.println("-");
                } else {
                    System.out.println("No peleo con Hembras");
                    System.out.println("-");
                }
                break;
             case HEMBRA:
                if (this.getSexo().equals(s.getSexo())) {
                    System.out.println("La voy a reventar, Sujetame los pendientes");
                    System.out.println("-");
                } else {
                    System.out.println("Le voy a reventar");
                    System.out.println("-");
                }
                break;

            default:
                break;
        }

    }
}
