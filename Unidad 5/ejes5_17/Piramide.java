package ejes5_17;

public class Piramide {
    private int altura;
    private static int PiramidesCreadas;

    public Piramide(int a) {
        altura = a;
        PiramidesCreadas++;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public static int getPiramidesCreadas() {
        return PiramidesCreadas;
    }

    public static void setPiramidesCreadas(int piramidesCreadas) {
        PiramidesCreadas = piramidesCreadas;
    }

    public String toString() {
        String g = "";
        int c = 0;
        for (int i = 0; i < this.altura; i++) {
            if (i>0) {
                g += "\n";
            }
            for (int f = 0; f <= c; f++) {
                g += "*";
            }
            c += 2;

        }
        return g;

    }

}
