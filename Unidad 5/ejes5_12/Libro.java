package ejes5_12;

public class Libro extends Publicacion implements Presentable {

    private boolean prestado;

    //
    public Libro(String i, String t, int a) {
        super(i, t, a);
        prestado = false;
    }

    //
    public boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void presta() {
      if (prestado) {
        System.out.println("Lo siento, el libro ya esta prestado.");
      } else {
        this.prestado =true;
      }
        

    }

    @Override
    public void devuelve() {
      this.prestado=false;
    }

    @Override
    public boolean estaPrestado() {
        boolean p=false;
        if (this.prestado) {
            p=true;
        }
       return p;
    }

    @Override
    public String toString() {
        String p;
        if (prestado) {
            p = " (prestado)";
        } else {
            p = " (no prestado)";
        }
        return super.toString() + p;
    }

}
