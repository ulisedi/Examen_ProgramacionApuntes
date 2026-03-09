package ejes5_2_4;

public class Disco {
    private int codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;
    private static int ccodigo;

    //
    public Disco(String t, String g, String a, int d) {
        ccodigo++;
        codigo = ccodigo;
        titulo = t;
        autor = a;
        genero = g;
        duracion = d;
    }

    public Disco(String t, String g) {
        ccodigo++;
        codigo = ccodigo;
        titulo = t;
        genero = g;
        autor = "-----";
        duracion = 0;
    }

    //
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public static int getCcodigo() {
        return ccodigo;
    }

    public static void setCcodigo(int ccodigo) {
        Disco.ccodigo = ccodigo;
    }

    //
    public void borrarD() {
        titulo = "---Borrado---";
        genero = "---Borrado---";
        autor = "---Borrado---";
        duracion = 0;
    }

    public static Disco crearDsc(String t, String g) {

        return new Disco(t, g);
    }

   

    public static Disco crearDs(String t, String g, String a, int d) {

        return new Disco(t, g, a, d);
    }

    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion + " s";
        cadena += "\n------------------------------------------";
        return cadena;
    }

}
