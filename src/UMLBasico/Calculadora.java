
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

public class Calculadora {
    
    // No hay atributo de la clase Impuesto, solo el metodo.
    
    public void calcular(Impuesto impuesto){
    
        if (impuesto != null){
            System.out.println("Se esta calculando el impuesto."); 
        } else {
            System.out.println("No hay impuesto para calcular");
        }
}

} // Cierre de clase.