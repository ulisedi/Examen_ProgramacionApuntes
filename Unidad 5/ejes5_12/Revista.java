package ejes5_12;

public class Revista extends Publicacion  {
    private int numero;

    //
    public Revista(String i, String t, int a, int n) {
        super(i, t, a);
        numero = n;
    }

    //
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    

    @Override
    public String toString() {
        return super.toString();
    }
}
