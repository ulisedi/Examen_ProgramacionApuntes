package ejes5_12;

public abstract class Publicacion {
    private String isbn;
    private String titulo;
    private int año;

    public Publicacion(String i, String t, int a) {
        isbn = i;
        titulo = t;
        año = a;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String toString() {
        return "ISBN: " + this.getIsbn() + ",titulo: " + this.getTitulo() + "año de publicacion: " + this.año;
    }

}
