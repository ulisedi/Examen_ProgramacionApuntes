package ejes5_11;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public class TarjetaRegalo {
    private int id;
    private float dinero;
    //
    public TarjetaRegalo(float i) {
        dinero = i;
        id = (int) (Math.random() * 1000000);
    }
    //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float d) {
        this.dinero = d;
    }
    //
    public void gasta(double g) {
        if (g > this.getDinero()) {

            System.out.println("No tienes suficiente saldo para gastar " + g+ " \u20AC");
        } else {
            this.dinero -= g;
            System.out.println(this.toString());
        }

    }
    public TarjetaRegalo fusionaCon(TarjetaRegalo t) {
        float d1 = this.dinero + t.getDinero();
        this.dinero = 0;
        t.setDinero(0);

        return new TarjetaRegalo(d1);
    }
    public String toString() {
        Locale locale = new Locale("es", "ES");
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
        DecimalFormat df = new DecimalFormat("#,##0.00 \u20AC", symbols);
        return "Tarjeta nº " + this.getId() + " - " + "Saldo " + df.format(this.getDinero());
    }

}
