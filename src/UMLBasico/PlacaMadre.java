
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

public class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
    
    
}
