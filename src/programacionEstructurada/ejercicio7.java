
package programacionEstructurada;

import java.util.Scanner;

/**
7.  Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. 
Si el usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota hasta que ingrese un valor válido.

 */
public class ejercicio7 {
    
    public static void main (String[] args){
    
        int num = 0;
    
        do {
        System.out.println("Ingrese una nota entre 0 y 10 ");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            
                System.out.println("Error: Nota invalida.");
                
        } while (num > 10 || num < 0); //(num >= 0 && num <= 10); 
                
        //(num > 10 || num < 0)
                if (num > 0 && num <= 10)  {
                    System.out.println("Nota guardada correctamente. ");    
                }
    } // Cierre main.
    
} // Cierre clase.
