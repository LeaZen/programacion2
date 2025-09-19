
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

public class Impuesto {
    // ATRIBUTOS
    private String monto;
    private Contribuyente contribuyente;
    // CONSTRUCTOR
    public Impuesto(String monto) {
        this.monto = monto;
    }

    public String getMonto() {
        return monto;
    }

    public String getContribuyente() {
        if (contribuyente == null){
            return "El nombre del contribuyente no esta disponible.";
        } else {
            return contribuyente.toString();
        } 
    }
   
    
    
} // Cierre clase.
