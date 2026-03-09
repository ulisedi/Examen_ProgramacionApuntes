package ejes5_17;

public class Rectangulo {
    private int base;
    private int altura;
    private static int RectangulosCreados;

    public Rectangulo(int b, int a) {
        base = b;
        altura = a;
        RectangulosCreados++;

    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public static int getRectangulosCreados() {
        return RectangulosCreados;
    }

    public static void setRectangulosCreados(int rectangulosCreados) {
        RectangulosCreados = rectangulosCreados;
    }

    public String toString() {
        String g = "";

        for (int i = 0; i < this.altura; i++) {

            if (i > 0) {
                g += "\n";
            }

            for (int f = 0; f < this.base; f++) {
                g += "*";
            }

        }
        return g;
    }

}
