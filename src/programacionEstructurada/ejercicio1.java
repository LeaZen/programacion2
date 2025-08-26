
package programacionEstructurada;

import java.util.Scanner;

public class ejercicio1 {
/*
1. Verificación de Año Bisiesto.
Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. 
Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
 */
    public static void main(String[] args) { 
        
        System.out.println("Ingrese un año ");
        Scanner input = new Scanner(System.in); 
        int anio = input.nextInt();
        
        anioBisiesto (anio);// Llamado a la función.
    } // Cierre de main.
        
    static void anioBisiesto(int anio){
    
        if (anio % 4 == 0 && (anio % 100 !=0) || (anio % 400 == 0)) {
             System.out.println("El año es bisiesto ");    
        } else {
             System.out.println("El año no es bisiesto ");
        }
    } // Cierre función.
    
} // Cierre de clase.
