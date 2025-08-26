
package programacionEstructurada;

import java.util.Scanner;
import static programacionEstructurada.ejercicio3.etapaEdad;

/**
4.  Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento Categoría B: 15% de descuento Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el precio final

 */
public class ejercicio4 {
    
     public static void main(String[] args) { 
        
        System.out.println("Ingrese el precio ");
        Scanner input = new Scanner(System.in); 
        int precio = input.nextInt();
        
        System.out.println("Ingrese la categoria (A, B o C) ");
        Scanner input2 = new Scanner(System.in); 
        char categoria = input2.nextLine().charAt(0);
        categoria = Character.toUpperCase(categoria);
       
        calculoDescuento (precio, categoria);// Llamado a la función.
       
    } // Cierre main.
     
     static void calculoDescuento (int precio, char categoria){
            
         System.out.println("El precio es: " + precio);
         
         int descuento = 0;
         int nuevoPrecio = precio - descuento;
     
            if (categoria == 'A') {
                 descuento = 10;
                 nuevoPrecio = precio -(precio * descuento) / 100;
                 System.out.println("El precio con el descuento " + descuento + "% queda en: $ " + nuevoPrecio);
               }
                else if (categoria == 'B') {
                  descuento = 15;
                  nuevoPrecio = precio -(precio * descuento) / 100;
                  System.out.println("El precio con el descuento " + descuento + "% queda en: $ " + nuevoPrecio);    
                }
                else if (categoria == 'C'){
                  descuento = 20;
                  nuevoPrecio = precio -(precio * descuento) / 100;
                  System.out.println("El precio con el descuento " + descuento + "% queda en: $ " + nuevoPrecio);    
                  }
                else {
                    System.out.println("No tiene descuento. ");    
                  }
            
    } // Cierre función.
    
} // Cierre clase.
