
package UMLBasico;

/**
3. Libro - Autor - Editorial
a.	Asociación unidireccional: Libro → Autor
b.	Agregación: Libro → Editorial
Clases y atributos:
i.	Libro: titulo, isbn
ii.	Autor: nombre, nacionalidad
iii.	Editorial: nombre, direccion
 */

public class Autor {
    private String nombre;
    private String nacionalidad;
    

    public Autor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
} // Cierre de clase.

