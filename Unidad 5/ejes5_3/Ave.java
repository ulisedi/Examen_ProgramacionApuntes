package ejes5_3;

public abstract class Ave extends Animal {
    public Ave() {
        super();
    }

    public Ave(Sexo s, double e, double p, Alim a) {
        super(s, e, p, a);
    }

    public void ponHuevo() {
        double e = this.getEdad();
        if (this.getSexo().equals(Sexo.HEMBRA)) {
            if (e > 1) {
                System.out.println("\"Ptclo\"");
                System.out.println("-");

            } else {
                System.out.println("Soy muy joven para poner un huevos");
                System.out.println("-");
            }

        } else {
            System.out.println("No puedo poner huvos soy un macho");
             System.out.println("-");
        }

    }

    public void vuela() {
        double e = this.getEdad();
        if (e > 6) {
            System.out.println("soy demasiado mayor ;c");
            System.out.println("-");

        } else {
            System.out.println("Soy muy joven para poner un huevo");
            System.out.println("-");
        }
        if (e < 7 && e > 1) {
            System.out.println("Me flipa volar pero es complicado");
            System.out.println("-");
        }
    }

    public void asearte() {
        System.out.println("bua, lo necesitaba");
        System.out.println("-");
    }

}
