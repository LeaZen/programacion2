
package UMLBasico;

/**
7.	Vehículo - Motor - Conductor
a.	Agregación: Vehículo → Motor
b.	Asociación bidireccional: Vehículo ↔ Conductor
Clases y atributos:
i.	Vehículo: patente, modelo
ii.	Motor: tipo, numeroSerie
iii.	Conductor: nombre, licencia
 */

public class Motor {
    // ATRIBUTOS
    private String tipo;
    private String numeroSerie;
    // CONSTRUCTOR
    public Motor(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    
}
