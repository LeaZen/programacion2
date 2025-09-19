
package UMLBasico;

/**
2.	Celular - Batería - Usuario
a.	Agregación: Celular → Batería
b.	Asociación bidireccional: Celular ↔ Usuario
Clases y atributos:
i.	Celular: imei, marca, modelo
ii.	Batería: modelo, capacidad
iii.	Usuario: nombre, dni
 */

public class Bateria {
    // ATRIBUTOS
    private String modelo;
    private String capacidad;
    
    // COSNTRUCTOR
    public Bateria(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return modelo;
    }

    public void setNombre(String modelo) {
        this.modelo = modelo;
    }
    
    
    @Override
         public String toString() {
         return modelo;
         }
    }

