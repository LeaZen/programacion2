
package UMLBasico;

/**
4.	TarjetaDeCrédito - Cliente - Banco
a.	Asociación bidireccional: TarjetaDeCrédito ↔ Cliente
b.	Agregación: TarjetaDeCrédito → Banco
Clases y atributos:
i.	TarjetaDeCrédito: numero, fechaVencimiento
ii.	Cliente: nombre, dni
iii.	Banco: nombre, cuit
 */

public class Banco {
    // ATRIBUTOS
    private String nombre;
    private String cuit;

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
}
