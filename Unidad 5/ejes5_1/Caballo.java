package ejes5_1;
public class Caballo {
    String nombre;
    int edad;
    String raza;
    boolean siMestizo;
    float alturaGrupa;
    float longitud;
    float peso;
    char sexo;
    public Caballo(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }
    //
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //
    public void relinchar() {
        System.out.println("\n" + this.nombre + "hiiiiiii");
    }
    public void correr() {
        System.out.println("\n" + this.nombre + " Dice: " + "*****Arreaaaaaaaa*****");
    }
    public void saltar() {
        System.out.println("\n" + this.nombre + "Soy caballo de carga, no hago esas cosas");
    }
    public void comer(String comida) {
        System.out.println("\n" + this.nombre + " Dice: " + "\nMe gustan las manzanas y las zanahorias");
        if (comida.equalsIgnoreCase("zanahoria") || comida.equalsIgnoreCase("manzana")) {
            System.out.println(" Uhmmm...rico");
        } else {
            System.out.println(" Para tiiiiii");
        }
    }

    //
    public String toString() {
        String cadena;
        cadena = "-------------------------\n";
        cadena += "Nombre: " + this.nombre + "\n";
        cadena += "Sexo: " + this.sexo + "\n";
        cadena += "Edad: " + this.edad;
        return cadena;
    }

}