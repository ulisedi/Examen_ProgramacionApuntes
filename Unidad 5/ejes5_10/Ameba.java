package ejes5_10;

public class Ameba {
    private int peso;

    //
    public Ameba() {
        peso = 3;
    }

    //
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //
    public void come(Ameba n) {
        this.peso+= n.getPeso()-1;
        n.peso = 0;
    }

    public void come(int n) {
        this.peso += n-1;

    }

    public String toString() {
        return "Soy una ameba y peso " + this.getPeso() + " microgramos";
    }

}
