package ejes5_5;

public class Pizza {

    private String tamaño;
    private String tipo;
    private String estado;
    private static int pedidas;
    private static int servidas;

    ///////
    public Pizza() {
        tamaño = "mediana";
        tipo = "margarita";
        estado = "pedida";
        pedidas++;
    }

    public Pizza(String t, String ti) {
        this.tamaño = t;
        this.tipo = ti;
        estado = "pedida";
        pedidas++;
    }

    ///////
    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static int getPedidas() {
        return pedidas;
    }

    public static void setPedidas(int pedidas) {
        Pizza.pedidas = pedidas;
    }

    public static int getServidas() {
        return servidas;
    }

    public static void setServidas(int servidas) {
        Pizza.servidas = servidas;
    }

    ////
    /// 
    public void sirve() {
        if (this.estado.equals("pedida")) {
            setEstado("servido");
            servidas++;
        } else {
            System.out.println("Esta pizza ya ha sido servida");
        }
    }

    public String toString() {

        return "Pizza :" + this.getTipo() + "," + this.getTamaño() + "," + this.getEstado();

    }

}
