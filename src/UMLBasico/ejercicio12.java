
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
public class ejercicio12 {
    
    public static void main(String[] args) {
        
        Impuesto abl = new Impuesto("$ 10.000");
        
        Calculadora calculo = new Calculadora();
        
        System.out.println(abl.getMonto());
        System.out.println(abl.getContribuyente());
        calculo.calcular(abl);
        
        
        
    }
    
}
