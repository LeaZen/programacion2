
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

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; 
    
    // CONSTRUCTOR
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        
        if (computadora!= null && computadora.getPropietario() != this){
            computadora.setPropietario(this);    
        }
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
    
    
    
}
