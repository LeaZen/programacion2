
package programacionEstructurada;

import java.util.Scanner;

/**
6.  Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros
y cuente cuántos son positivos, negativos y cuántos son ceros.

 */
public class ejercicio6 {
    
    public static void main (String[] args) {
        
        int num, cero, negativos, positivos;

        positivos = 0;
	negativos = 0;
	cero = 0;
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Ingrese un numero entero (Hasta 10 veces)");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            
                if (num == 0) {
                 cero += 1;  
                }
                else if (num < 0) {
                    negativos += 1;
                } else {
                    positivos += 1;	
                } 
        } // Cierre for.
        
        System.out.println("cantidad de numeros cero " + cero);
        System.out.println("cantidad de numeros negativos " + negativos);
        System.out.println("cantidad de numeros positivos " + positivos);        
        
    } // Cierre main.
    
} // Cierre clase.
