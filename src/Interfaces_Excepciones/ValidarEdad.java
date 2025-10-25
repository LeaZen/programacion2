
package Interfaces_Excepciones;

public class ValidarEdad {
    public static void main(String[] args) {
        try {
            int edad = -5;
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad invalida: " + edad);
            }
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
