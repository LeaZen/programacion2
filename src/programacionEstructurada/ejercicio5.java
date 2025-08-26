

package programacionEstructurada;

import java.util.Scanner;

/**
 5.  Suma de Números Pares (while).
 Escribe un programa que solicite números al usuario y sume solo los números pares. 
 El ciclo debe continuar hasta que el usuario ingrese el número 0, 
 momento en el que se debe mostrar la suma total de los pares ingresados.
 */
public class ejercicio5 {
    
    public static void main(String[] args) { 
        
        int suma = 0;
        int num = -1;
        
        while (num != 0) {
        System.out.println("Ingrese numeros pares y 0 para salir / finalizar ");
        Scanner input = new Scanner(System.in); 
        num = input.nextInt(); 
        
            if (num % 2 == 0) {
                suma += num;
            }
        } // Cierre while.
        
        System.out.println("El total de los numeros pares es " + suma);
            
    } // Cierre main.
    
} // Cierre clase.
