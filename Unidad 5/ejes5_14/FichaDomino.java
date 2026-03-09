package ejes5_14;

public class FichaDomino {
    private int n1;
    private int n2;

    public FichaDomino(int i, int d) {
        n1 = i;
        n2 = d;
    }

    public FichaDomino() {
        n1 = (int) (Math.random() * 7);
        n2 = (int) (Math.random() * 7);
    }
    //

    public int getn1() {
        return n1;
    }

    public void setn1(int n1) {
        this.n1 = n1;
    }

    public int getn2() {
        return n2;
    }

    public void setn2(int n2) {
        this.n2 = n2;
    }

    //
    public String voltea() {
        int a = this.n1;
        this.n1 = this.n2;
        this.n2 = a;
       return toString();
    }

    public Boolean encaja(FichaDomino a) {
        if ((a.getn1() == this.n1 || a.getn1() == this.n2) || (a.getn2() == this.n1 || a.getn2() == this.n2)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        if (this.n1 == 0) {
            return "[" + "]" + "[" + this.getn2() + "]";
        } else if (this.n2 == 0) {
            return "[" + this.getn1() + "]" + "[" + "]";
        } else {
            return "[" + this.getn1() + "]" + "[" + this.getn2() + "]";
        }

    }

}
