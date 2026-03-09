package ejes5_16;

public class Linea {
    private Punto n1;
    private Punto n2;

    public Linea(Punto x1, Punto y1) {

        n1 = x1;
        n2 = y1;

    }

    public Punto getN1() {
        return n1;
    }

    public void setN1(Punto n1) {
        this.n1 = n1;
    }

    public Punto getN2() {
        return n2;
    }

    public void setN2(Punto n2) {
        this.n2 = n2;
    }

@Override
public String toString(){
        return "Línea formada por los puntos "+"("+n1.toString()+")"+"y"+"("+ n2.toString()+")";
    }

}
