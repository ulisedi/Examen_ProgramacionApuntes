package ejes5_9;

public class Movil extends Terminal {

    private String tarifa;
    private double deuda;

    //
    public Movil(String n, String t) {
        super(n);
        tarifa = t;
    }

    //
    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    //

    public void llama(Movil n, int t) {
        this.tiempoCon += t;
        n.tiempoCon += t;
        if (this.tarifa.equals("rata")) {
            this.deuda += 0.06 * ((double)t / 60);
        } else if (this.tarifa.equals("mono")) {
            this.deuda += 0.12 * ((double)t / 60);
        } else {
            this.deuda += 0.30 * ((double)t / 60);
        }
    }

    @Override
    public String toString() {

        return "Nº " + this.numero + " - " + this.tiempoCon + "s de conversación" + " - " + "tarifados " + String.format("%,.2f", deuda)+ " euros";
    }
    //

}
