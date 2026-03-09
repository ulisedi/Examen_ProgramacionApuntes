package ejes5_3;

import java.util.Scanner;

public abstract class Mamifero extends Animal {
    Scanner s = new Scanner(System.in);

    //////
    public Mamifero() {
        super();
    }
    public Mamifero(Sexo s, double e, double p, Alim a) {
        super(s, e, p, a);
    }

    ////
    public void amamantar() {

        if (this.getSexo() == Sexo.HEMBRA) {
            System.out.println("¿donde esta mi hijo?");
        } else {
            System.out.println("Soy un Macho, no me sale leche de las tetas :v");
        }

    }

    public void cuidarProle() {

        int eleccion = 1;
        if (this.getSexo() == Sexo.HEMBRA) {
            while (eleccion > 2 || eleccion < 1) {

                System.out.println("¿Que quieres hacer?");
                System.out.println("-------------------");
                System.out.println("1. Jugar con tu mama y papa");
                System.out.println("2. Jugar con el entorno");
                try {
                    eleccion = s.nextInt();
                } catch (Exception e) {
                    s.nextInt();
                    System.out.println("La eleccion tiene que ser 1/2");
                }
                if (eleccion == 1) {
                    System.out.println("\"Te diviertes\" ");
                    System.out.println("-");
                }
                if (eleccion == 2) {
                    System.out.println("Te pones a jugar con una piedra y te haces daño");
                    System.out.println("-");
                }
            }
        } else {
            System.out.println("cojes una piedra y la tiras a un lago, te partes de risa");
            System.out.println("-");
        }
    }

    public void come() {
        int eleccion = 1;
        while (eleccion >= 1 && eleccion <= 4) {
            System.out.println("¿Que quieres comer?");
            System.out.println("1. Bichos ");
            System.out.println("2. Llerva");
            System.out.println("3. Carne");
            System.out.println("4. Fruta");
            System.out.println("5. Salir");
            System.out.println("--------------");

            try {
                eleccion = s.nextInt();
            } catch (Exception e) {
                System.out.println("Error en el valor introducido");
                continue;
            }
            switch (eleccion) {
                case 1:
                    if (this.getAlim() == Alim.CARNE || this.getAlim() == Alim.OMNI) {
                        System.out.println("Comible pero, ¡que asco!");
                        System.out.println("-");
                    } else {
                        System.out.println("Yo no puedo comer eso soy: " + this.getAlim());
                        System.out.println("-");
                    }
                    break;
                case 2:
                    if (this.getAlim() == Alim.CARNE) {
                        System.out.println("Yo no puedo comer eso soy: " + this.getAlim());
                        System.out.println("-");
                    } else {

                        System.out.println("Me flipa el pasto");
                        System.out.println("-");
                    }
                    break;
                case 3:
                    if (this.getAlim() == Alim.CARNE || this.getAlim() == Alim.OMNI) {
                        System.out.println("Espero que no sea carne de rata");
                        System.out.println("-");
                    } else {
                        System.out.println("Yo no puedo comer eso: " + this.getAlim());
                        System.out.println("-");
                    }
                    break;
                case 4:
                    if (this.getAlim() == Alim.CARNE) {
                        System.out.println("No me gusta la fruta soy: " + this.getAlim());
                        System.out.println("-");
                    } else {
                        System.out.println("Bua espero que sea una manzana");
                        System.out.println("-");
                    }
                    break;

                default:
                    break;
            }
            System.out.println("--------------");
        }
    }

}
