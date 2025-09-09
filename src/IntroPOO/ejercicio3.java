
package IntroPOO;

/**
Encapsulamiento con la Clase Libro 
a. Crear una clase Libro con atributos privados: titulo, autor, 
añoPublicacion. 
Métodos requeridos: Getters para todos los atributos. Setter con validación 
para añoPublicacion. 
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con 
uno válido, mostrar la información final. 
 */
public class ejercicio3 {
    
    public static void main(String[] args) {
        
        Libro l1 = new Libro("Roberto Arlt", "El juguete rabioso", 1926 );
        
        l1.mostrarInfo();
        
        l1.setAnioPublicacion(-1);
        
        l1.mostrarInfo();
        
        l1.setAnioPublicacion(1930);
        
        l1.mostrarInfo();
    }
    
}
