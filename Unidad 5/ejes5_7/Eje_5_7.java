package ejes5_7;

import java.util.Scanner;

/**
 * crear un menu de compra de entradas segun unas zonas especificas y con unas
 * entradas especificas
 * @author ECD
 * @input de 1-4 para los menus y luego un numero int según las entradas que se
 *        quieran comprar
 * @output los valores resultado de las opciones 
 */
public class Eje_5_7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean menu = true;
        int el;
        Zona principal = new Zona(1000);
        Zona compra = new Zona(200);
        Zona vip = new Zona(25);
        while (menu) {
            System.out.println("--");
            System.out.println("1. Mostrar el numero de entradas libres ");
            System.out.println("2. Comprar entradas ");
            System.out.println("3. Salir");
            try {
                el = s.nextInt();
            } catch (Exception e) {
                System.out.println("--");
                System.out.println("Error en el valor introduccido");
                s.nextLine();

                continue;

            }

            switch (el) {
                case 1:

                    System.out.println("--");
                    System.out.println("Quedan de Principal: " + principal.getEntradasPorVender());
                    System.out.println("Quedan de Compra-Venta: " + compra.getEntradasPorVender());
                    System.out.println("Quedan de Vip: " + vip.getEntradasPorVender());

                    break;
                case 2:
                    System.out.println("--");
                    System.out.println("¿Para que grupo quieres las entradas?");
                    System.out.println("1. Principal");
                    System.out.println("2. Compra-Venta ");
                    System.out.println("3. Vip");
                    try {
                        el = s.nextInt();
                    } catch (Exception e) {
                        System.out.println("--");
                        s.nextLine();
                        continue;
                    }
                    switch (el) {
                        case 1:
                            System.out.println("--");
                            System.out.println("¿Cuantas quieres comprar?");
                            el = s.nextInt();
                            principal.vender(el);
                            break;
                        case 2:
                            System.out.println("--");
                            System.out.println("¿Cuantas quieres comprar?");
                            el = s.nextInt();
                            compra.vender(el);
                            break;
                        case 3:
                            System.out.println("--");
                            System.out.println("¿Cuantas quieres comprar?");
                            el = s.nextInt();
                            vip.vender(el);
                            break;

                        default:
                            break;
                    }

                    break;
                case 3:
                    System.out.println("--");
                    System.out.println("Adios.");
                    menu = false;
                    break;

                default:
                    break;
            }

        }
        s.close();
    }
}
