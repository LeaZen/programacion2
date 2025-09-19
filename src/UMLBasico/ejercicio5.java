
package UMLBasico;

/**
5.	Computadora - PlacaMadre - Propietario
a.	Composición: Computadora → PlacaMadre
b.	Asociación bidireccional: Computadora ↔ Propietario
Clases y atributos:
i.	Computadora: marca, numeroSerie
ii.	PlacaMadre: modelo, chipset
iii.	Propietario: nombre, dni
 */

public class ejercicio5 {
    
    public static void main(String[] args) {
        
        
        Computadora compuDos = new Computadora("Lenovo", "PlacaTres");
        Propietario owner = new Propietario ("Cristiano", "30623987");
        
        //compuDos.mostrarPlacaMadre();
        System.out.println("La computadora tiene de propietario a " + compuDos.getPropietario());
        compuDos.setPropietario(owner);
        System.out.println("La computadora tiene de propietario a " + compuDos.getPropietario().getNombre());
        System.out.println("El propietario " + owner.getNombre() + " tiene la computadora " + owner.getComputadora().getMarca());
        
    }
    
            
    
}
