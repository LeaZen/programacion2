
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

public class Editorial {
    private String nombre;
    private String direccion;

    public Editorial(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
