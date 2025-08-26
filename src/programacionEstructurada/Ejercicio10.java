
package programacionEstructurada;

import java.util.Scanner;

/**
10. Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), 
que calcule el nuevo stock después de una venta y recepción de productos:
 */

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();

        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();

        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();

        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
} // Cierre clase.


