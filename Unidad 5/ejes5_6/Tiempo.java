package ejes5_6;

public class Tiempo {

    private int horas;
    private int minutos;
    private int segundos;

    //
    public Tiempo() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    public Tiempo(int h, int m, int s) {
        horas = h;
        minutos = m;
        segundos = s;

    }

    //
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    //
    public Tiempo suma(Tiempo t) {
        int se = this.segundos + t.segundos;
        int mi = this.minutos + t.minutos;
        int ho = this.horas + t.horas;

        if (se >= 60) {
            mi += se / 60;
            se = se % 60;
        }

        if (mi >= 60) {
            ho += mi / 60;
            mi = mi % 60;
        }

        return new Tiempo(ho, mi, se);
    }

    public Tiempo resta(Tiempo h) {
        int tot1 = ((((this.getHoras() * 60)) * 60) + (this.getMinutos() * 60) + this.getSegundos())- ((((h.getHoras() * 60)) * 60) + (h.getMinutos() * 60) + h.getSegundos());
        int ho = tot1 / 3600;
        int mi = (tot1 % 3600) / 60;
        int se = tot1 % 60;
        return new Tiempo(ho, mi, se);
    }

    public String toString() {
        return this.getHoras() + "h " + this.getMinutos() + "m " + this.getSegundos() + "s.";
    }

}
