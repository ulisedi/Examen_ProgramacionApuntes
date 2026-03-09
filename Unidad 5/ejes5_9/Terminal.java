package ejes5_9;

public class Terminal {
    protected String numero;
    protected int tiempoCon;

    //
    public Terminal(String n) {
        numero = n;
    }

    //
 public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getTiempoCon() {
        return tiempoCon;
    }

    public void setTiempoCon(int tiempoCon) {
        this.tiempoCon = tiempoCon;
    }
    //
    public void llama(Terminal n, int t) {
        this.tiempoCon += t;
        n.tiempoCon+= t;
    }


    public String toString (){
        return "Nº "+ this.numero+" - "+ this.tiempoCon + "s de conversación";
    }

   
}
