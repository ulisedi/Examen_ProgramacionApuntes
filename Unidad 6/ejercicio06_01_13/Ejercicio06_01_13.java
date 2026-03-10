/**
@author: ECD
Programa que permita llevar control de los productos de un almacen
@param: imputs necesarios para cada método
@return: lo que hacen los métodos
*/

package ejercicio06_01_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio06_01_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Articulo> almacen = new HashMap<>();
        int opcion = 0;
        while (opcion != 7) {
            System.out.println("=== GESTISIMAL ===");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Venta");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                opcion = 0;
            }

            switch (opcion) {
                // @Author: ECD
                case 1: {
                    System.out.println("--- LISTADO DE ARTÍCULOS ---");
                    if (almacen.isEmpty()) {
                        System.out.println("No hay artículos en el almacén.");
                    } else {
                        for (Map.Entry<String, Articulo> entry : almacen.entrySet()) {
                            System.out.println(entry.getValue());
                        }
                    }
                    break;
                }

                case 2: {
                    System.out.println("--- ALTA DE ARTÍCULO ---");
                    System.out.print("Código: ");
                    String codigo = sc.nextLine().trim();

                    if (almacen.containsKey(codigo)) {
                        System.out.println("Error: ya existe un artículo con ese código.");
                        break;
                    }

                    System.out.print("Descripción: ");
                    String descripcion = sc.nextLine();

                    System.out.print("Precio de compra: ");
                    double pCompra;
                    try {
                        pCompra = Double.parseDouble(sc.nextLine().trim());
                    } catch (Exception e) {
                        System.out.println("Precio inválido.");
                        break;
                    }

                    System.out.print("Precio de venta: ");
                    double pVenta;
                    try {
                        pVenta = Double.parseDouble(sc.nextLine().trim());
                    } catch (Exception e) {
                        System.out.println("Precio inválido.");
                        break;
                    }

                    System.out.print("Stock inicial: ");
                    int stock;
                    try {
                        stock = Integer.parseInt(sc.nextLine().trim());
                    } catch (Exception e) {
                        System.out.println("Stock inválido.");
                        break;
                    }

                    almacen.put(codigo, new Articulo(codigo, descripcion, pCompra, pVenta, stock));
                    System.out.println("Artículo dado de alta correctamente.");
                    break;
                }
                // @Author: ECD
                case 3: {
                    System.out.println("--- BAJA DE ARTÍCULO ---");
                    System.out.print("Código a borrar: ");
                    String codigo = sc.nextLine().trim();

                    if (!almacen.containsKey(codigo)) {
                        System.out.println("Error: no existe un artículo con ese código.");
                        break;
                    }

                    almacen.remove(codigo);
                    System.out.println("Artículo borrado correctamente.");
                    break;
                }

                case 4: {
                    System.out.println("--- MODIFICACIÓN DE ARTÍCULO ---");
                    System.out.print("Código a modificar: ");
                    String codigo = sc.nextLine().trim();

                    if (!almacen.containsKey(codigo)) {
                        System.out.println("Error: no existe un artículo con ese código.");
                        break;
                    }

                    Articulo a = almacen.get(codigo);

                    System.out.println("Artículo actual:");
                    System.out.println(a);

                    System.out.print("Nueva descripción: ");
                    a.setDescripcion(sc.nextLine());

                    System.out.print("Nuevo precio de compra: ");
                    try {
                        a.setPrecioCompra(Double.parseDouble(sc.nextLine().trim()));
                    } catch (Exception e) {
                        System.out.println("Precio inválido. No se cambia el precio de compra.");
                    }

                    System.out.print("Nuevo precio de venta: ");
                    try {
                        a.setPrecioVenta(Double.parseDouble(sc.nextLine().trim()));
                    } catch (Exception e) {
                        System.out.println("Precio inválido. No se cambia el precio de venta.");
                    }

                    System.out.print("Nuevo stock: ");
                    try {
                        a.setStock(Integer.parseInt(sc.nextLine().trim()));
                    } catch (Exception e) {
                        System.out.println("Stock inválido. No se cambia el stock.");
                    }

                    System.out.println("Artículo modificado.");
                    break;
                }
                // @Author: ECD
                case 5: {
                    System.out.println("--- ENTRADA DE MERCANCÍA ---");
                    System.out.print("Código del artículo: ");
                    String codigo = sc.nextLine().trim();

                    Articulo a = almacen.get(codigo);
                    if (a == null) {
                        System.out.println("Error: no existe un artículo con ese código.");
                        break;
                    }

                    System.out.print("Unidades a añadir: ");
                    int unidades;
                    try {
                        unidades = Integer.parseInt(sc.nextLine().trim());
                    } catch (Exception e) {
                        System.out.println("Número inválido.");
                        break;
                    }

                    if (unidades < 0) {
                        System.out.println("Error: no puedes añadir unidades negativas.");
                        break;
                    }

                    a.setStock(a.getStock() + unidades);
                    System.out.println("Entrada realizada. Stock actual: " + a.getStock());
                    break;
                }
                // @Author: ECD
                case 6: {
                    System.out.println("--- VENTA ---");
                    System.out.println("Vas metiendo artículos. Para terminar, escribe FIN.");
                    System.out.println();

                    double subtotal = 0.0;

                    while (true) {
                        System.out.print("Código (o FIN): ");
                        String codigo = sc.nextLine().trim();

                        if (codigo.equalsIgnoreCase("FIN")) {
                            break;
                        }

                        if (!almacen.containsKey(codigo)) {
                            System.out.println("No existe ese código.");
                            continue;
                        }

                        Articulo a = almacen.get(codigo);

                        System.out.print("Cantidad: ");
                        int cantidad;
                        try {
                            cantidad = Integer.parseInt(sc.nextLine().trim());
                        } catch (Exception e) {
                            System.out.println("Cantidad inválida.");
                            continue;
                        }

                        if (cantidad <= 0) {
                            System.out.println("La cantidad debe ser mayor que 0.");
                            continue;
                        }

                        if (cantidad > a.getStock()) {
                            System.out.println("No hay stock suficiente. Stock disponible: " + a.getStock());
                            continue;
                        }

                        a.setStock(a.getStock() - cantidad);

                        double precioLinea = a.getPrecioVenta() * cantidad;
                        subtotal = subtotal + precioLinea;

                        System.out.println("OK -> " + a.getDescripcion() + " | " + cantidad + " x " + a.getPrecioVenta()
                                + " = " + String.format("%.2f", precioLinea));
                    }

                    double iva = subtotal * 0.21;
                    double total = subtotal + iva;

                    System.out.println("--- TOTAL VENTA ---");
                    System.out.println("Subtotal: " + String.format("%.2f", subtotal));
                    System.out.println("IVA (21%): " + String.format("%.2f", iva));
                    System.out.println("TOTAL: " + String.format("%.2f", total));
                    break;
                }
                // @Author: ECD
                case 7: {
                    System.out.println("Saliendo...");
                    break;
                }

                default: {
                    System.out.println("Introduce numeros, por favor");
                    break;
                }
            }
        }

        sc.close();
    }
}