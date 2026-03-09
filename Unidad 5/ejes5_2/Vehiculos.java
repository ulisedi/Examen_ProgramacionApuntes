package ejes5_2;

public abstract class Vehiculos {

    private static int veiculosCreados;
    private static int kmTotales;
    private int kmRecorrido;

    //
    public Vehiculos() {
        this.kmRecorrido = 0;
        Vehiculos.veiculosCreados++;
    }

    //

    public static int getVeiculosCreados() {
        return veiculosCreados;
    }

    public static void setVeiculosCreados(int veiculosCreados) {
        Vehiculos.veiculosCreados = veiculosCreados;
    }

    public static int getKmTotales() {
        return kmTotales;
    }

    public static void setKmTotales(int kmTotales) {
        Vehiculos.kmTotales = kmTotales;
    }

    public int getKmRecorrido() {
        return kmRecorrido;
    }

    public void setKmRecorrido(int kmRecorrido) {
        this.kmRecorrido = kmRecorrido;
    }

    //
    public void anda(int km) {

        this.kmRecorrido += km;
        Vehiculos.kmTotales += km;
    }

}
