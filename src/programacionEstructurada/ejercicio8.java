
package programacionEstructurada;

import java.util.Scanner;

/**
8.  Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. 
La fórmula es: 
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) 
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al método y muestra el precio final.

 */
public class ejercicio8 {

    public static void main(String[] args) { 
        
        System.out.println("Ingrese el precio ");
        Scanner input = new Scanner(System.in); 
        double precio = input.nextDouble();
        
        System.out.println("Ingrese el porcentaje de impuesto ");
        Scanner input2 = new Scanner(System.in); 
        double impuesto = input2.nextDouble();
        
        System.out.println("Ingrese el porcentaje de descuento ");
        Scanner input3 = new Scanner(System.in); 
        double descuento = input3.nextDouble();
        
        
        
        double precioFinalResultado = calculoPrecio (precio, impuesto, descuento);// Llamado a la función.
        System.out.println("El precio final del producto es: " + precioFinalResultado);
        
    } // Cierre main.
     
     static double calculoPrecio (double precio, double impuesto, double descuento){
                 
        double impuestoCalculo = (precio * impuesto) / 100;
        double descuentoCalculo = (precio * descuento) / 100;
        double precioFinal = (precio + impuestoCalculo)- descuentoCalculo;

        return precioFinal;
      } // Cierre Función.
} // Cierre clase

