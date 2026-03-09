package ejes5_13;

/**
 * Implementar la clase CuentaCorriente. Cada cuenta corriente tiene un número de
 * cuenta de 10 dígitos. el número de cuenta se genera de forma aleatoria cuando. La cuenta se puede crear con
 * un saldo inicial; en caso de no especificar saldo, se pondrá a cero.
 * En una cuenta se pueden hacer ingresos y gastos. También es posible hacer
 * una transferencia entre una cuenta y otra. Se permite el saldo negativo. 
 * @author ECD
 * @input nada
 * @output los valores resultado de las opciones pedidas en el ejercicio
 */
public class Eje_5_13 {

    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente(1500);
        CuentaCorriente cuenta3 = new CuentaCorriente(6000);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        cuenta1.ingreso(2000);
        cuenta2.cargo(600);
        cuenta3.ingreso(75);
        cuenta1.cargo(55);
        cuenta2.transferencia(cuenta3, 100);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);

    }
}
