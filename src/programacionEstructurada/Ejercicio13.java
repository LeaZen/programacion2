
package programacionEstructurada;

/**
13. Impresión recursiva de arrays antes y después de modificar un elemento.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.
 */

public class Ejercicio13 {
    
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.80, 399.78, 89.54};

        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);

        // Modificamos el tercer producto (índice 2)
        precios[2] = 139.90;

        System.out.println("Precios modificados:");
        imprimirRecursivo(precios, 0);
    }

    static void imprimirRecursivo(double[] array, int indice) {
        if (indice < array.length) {
            System.out.println("Precio: $" + array[indice]);
            imprimirRecursivo(array, indice + 1);
        }
    }
}// Cierre clase.

