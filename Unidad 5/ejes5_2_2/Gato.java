package ejes5_2_2;

public class Gato {
   

    private String sexo;
    private String nombre;
    private String color;

    public Gato() {
        nombre = "---";
        sexo = "HEMBRA";
        color = "negro";
    }

    public Gato(String n, String c, String s) {
        nombre = n;
        sexo = s;
        color = c;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //

    //

    public String toString() {

        return "Este gato se llama:  " + this.nombre + " y es  " + this.sexo;

    }

}
