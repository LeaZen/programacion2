
package UMLBasico;

/**
12.	Impuesto - Contribuyente - Calculadora
a.	Asociación unidireccional: Impuesto → Contribuyente
b.	Dependencia de uso: Calculadora.calcular(Impuesto)
Clases y atributos:
i.	Impuesto: monto.
ii.	Contribuyente: nombre, cuil.
iii.	Calculadora->método: void calcular(Impuesto impuesto)
*/

public class Contribuyente {
    // ATRIBUTOS
    private String nombre;
    private String cuil;
    // CONSTRUCTOR
    public Contribuyente(String nombre) {
        this.nombre = nombre;
    }

 

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
