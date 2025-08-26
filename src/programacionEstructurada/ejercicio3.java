
package programacionEstructurada;

import java.util.Scanner;
import static programacionEstructurada.ejercicio2.numMayor;

/**
3.   Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente"
Entre 18 y 59 años: "Adulto" 60 años o más: "Adulto mayor"
 */

public class ejercicio3 {
    
    
    public static void main(String[] args) { 
        
        System.out.println("Ingrese su edad ");
        Scanner input = new Scanner(System.in); 
        int edad = input.nextInt();
        
       
        etapaEdad (edad);// Llamado a la función.
       
    } // Cierre de main.
    
    static void etapaEdad(int edad){
           
              if (edad >= 60) {
                  System.out.println("Usted es un Adulto mayor");
                  }
               else if (edad <= 59 && edad >=18) {
                  System.out.println("Usted es un Adulto");    
               }
                else if (edad >= 12 && edad <=17) {
                  System.out.println("Usted es un Adolescente");    
                }
                 else {
                  System.out.println("Usted es un niño");    
                 }   
                 
    } // Cierre función.
    
} // Cierre de clase.
