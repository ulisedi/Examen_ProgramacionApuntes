package ejes5_2_1;

public class Gato {
    public enum Sexo {
        HEMBRA, MACHO, AMBOS
    }

    private Sexo sexo;
    private String nombre;

    public Gato() {
        nombre = "---";
        sexo = Sexo.HEMBRA;
    }

    public Gato(String n, Sexo s) {
        nombre = n;
        sexo = s;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //

    //

    public String toString() {

        return "Este gato se llama:  " + this.nombre + " y es  " + this.sexo;

    }

}
