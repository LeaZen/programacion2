
package programacionEstructurada;

import java.util.Scanner;

/**
11. Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. 
Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global 
para calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento 
y muestra el precio final con descuento
 */    

public class Ejercicio11 {

    // Variable global
    static double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        calcularDescuentoEspecial(precio);
    }

    static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
} // Cierre clase.

    
    

