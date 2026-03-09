package e6_8;

public class Carta {
    public enum Palos {
        COPAS, BASTOS, ESPADAS, OROS
    }

    int valor;
    Palos palo;

    public Carta(int v, Palos p) {
        this.valor = v;
        this.palo = p;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    public String toString() {

        return this.valor + " - " + this.palo;
    }

}
