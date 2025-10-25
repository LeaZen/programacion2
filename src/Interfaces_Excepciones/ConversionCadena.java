
package Interfaces_Excepciones;

public class ConversionCadena {
     public static void main(String[] args) {
        try {
            String texto = "abc";
            int numero = Integer.parseInt(texto);
            System.out.println("Número: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto no es un numero valido.");
        }
    }
}
