

package programacionEstructurada;

import java.util.Scanner;

/**
9. Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en la zona de envío 
(Nacional o Internacional) y el peso del paquete. Nacional: $5 por kg Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar 
el costo del producto con el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. 
Luego, muestra el total a pagar.
 */

public class Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();

        System.out.println("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();

        System.out.println("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = input.next();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
    }

    static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona no válida");
            return 0;
        }
    }

    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
} // Cierre clase.


