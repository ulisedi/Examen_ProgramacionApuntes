package ejes5_2;
import java.util.Scanner;
/**
 *      crear las clase vehiculos y dos subclasescoche y bicicleta. un meno donde nos permita sumar y ver el resultado de los km
 * 
 * @author ECD
 * @input      las opciones del menú y los km que se van a recorrer
 * @output     los valores resultado de las opciones
 * 
 * 
 */
public class Eje_5_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int respuesta = 1;
        int kmandados=0;
        Bicicleta bici1 = new Bicicleta();
        Coche coche1 = new Coche();
        while (respuesta != 8) {

            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1 Anda con la bicicleta");
            System.out.println("2. Haz el caballo con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche ");
            System.out.println("5. Ver kilometrage de la bicicleta");
            System.out.println("6. Ver kilometrage de la coche");
            System.out.println("7. Ver kilometrage de la total");
            System.out.println("8. Salir");
            System.out.println("Elige una opcion (1 - 8):");
            try {
                respuesta = s.nextInt();
            } catch (Exception e) {
                System.out.println("Error en el valor introduccido");
                s.nextLine();
            }

            if (respuesta > 0 || respuesta < 9) {
                System.out.println("----------------------------------------------------");
                switch (respuesta) {
                    case 1:
                        System.out.println("¿Cuanto quieres andar?");
                        try {
                            kmandados= s.nextInt();
                        } catch (Exception e) {
                            System.out.println("Error en el valor introduccido");
                            s.nextLine();
                            continue;
                        }
                        bici1.anda(kmandados);
                        break;
                    case 2:
                        bici1.Caballito();
                        break;
                    case 3:
                         System.out.println("¿Cuanto quieres andar?");
                        try {
                            kmandados= s.nextInt();
                        } catch (Exception e) {
                            System.out.println("Error en el valor introduccido");
                            s.nextLine();
                            continue;
                        }
                        coche1.anda(kmandados);
                        break;
                    case 4:
                        coche1.QuemaRueda();
                        break;
                    case 5:
                        System.out.println("----------------------------------------------------");
                        System.out.println("Esto a recorrido la bici: "+ bici1.getKmRecorrido());
                        break;
                    case 6:
                        System.out.println("----------------------------------------------------");
                        System.out.println("Esto a recorrido con el coche: "+ coche1.getKmRecorrido());
                        break;
                    case 7:
                        System.out.println("----------------------------------------------------");
                        System.out.println("Esto a recorrido en total: "+ bici1.getKmTotales());
                        break;

                    default:
                        break;
                }
            }
           
        }
        
        s.close();
    }

}
