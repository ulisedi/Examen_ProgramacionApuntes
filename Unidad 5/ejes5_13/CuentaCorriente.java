package ejes5_13;

import java.text.NumberFormat;
import java.util.Locale;

public class CuentaCorriente {
    private int nCuenta;
    private int saldo;

    public CuentaCorriente(int s) {
        nCuenta = (int) (Math.random() * 1_000_000_000);
        saldo = s;
    }

    public CuentaCorriente() {
        nCuenta = (int) (Math.random() * 1_000_000_000);
        saldo = 0;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    //
    public void ingreso(int i) {
        this.saldo += i;

    }

    public void cargo(int i) {
        this.saldo -= i;

    }

    public void transferencia(CuentaCorriente a, int d) {
        this.saldo-=d;
        a.saldo+=d;
    }
    
   public String toString() {
    NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("es", "ES"));
    return "Número de cta: " + this.getnCuenta() + " Saldo: " + formato.format(this.getSaldo());
}



}
