package ejes5_18;

public class Incidencia {
    private String estado;
    private static int pendientes;
    private int puesto;
    private String info;
    private String resolucion;
    private  int id =1;
   

    private static int cid =1;

    

    public Incidencia(int p, String in) {
        this.id = cid;
        cid++;
        puesto = p;
        info = in;
        pendientes++;
        estado = "pendiente";

    }

    //
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static int getPendientes() {
        return pendientes;
    }

    public static void setPendientes(int pendientes) {
        Incidencia.pendientes = pendientes;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    //
    public void resuelve(String i) {
        this.resolucion = i;
        pendientes -= 1;
    }
    //

    public String toString() {

        return "Incidencia " + this.id + " - " + " Puesto: " + this.puesto + " - " + this.info + " - "  + this.estado;

    }

}
