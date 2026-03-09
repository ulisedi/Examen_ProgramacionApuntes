package ejes5_16;

public class Punto {
    private double x;
    private double y;

    //
    public Punto(double x1, double y1) {
        x = x1;
        y = y1;

    }

    //
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }



    public String toString(){
        return this.x +","+this.y;
    }
}
