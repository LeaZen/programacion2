
package programacionEstructurada;

import java.util.Scanner;

/*
2. Determinar el Mayor de Tres Números.
Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
 */

public class ejercicio2 {
    
    public static void main(String[] args) { 
        
       int[] numeros = new int [3];
       
       for (int i = 0; i < 3; i++) {
        int contador = i + 1;
        System.out.println("Ingrese el numero " + contador);
        Scanner input = new Scanner(System.in); 
        numeros[i] = input.nextInt();
        } // Cierre For
       
        numMayor (numeros);// Llamado a la función.
       
    } // Cierre de main.
    
     static void numMayor(int[]numeros){
        
        int mayor = 0;
        
        for (int i= 0; i < 3; i++) {
            
              if (numeros[i] > mayor) {
                  mayor = numeros[i];  
                 }
        
        } // Cierre For
        
        System.out.println("El numero mayor ingresado es " + mayor);
                 
    } // Cierre función.
    
} // Cierre de clase.





    /* SOLO PARA IMPRIMIR EL ARREGLO MIENTRAS PROCESO.
       for (int i= 0; i < 3; i++) {
        System.out.println(numeros[i]); 
        } // Cierre For
    */