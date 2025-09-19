
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

public class ejercicio3 {

    public static void main(String[] args) {
        
        Editorial planetaLibros = new Editorial ("Planeta Libros");
        Libro nuevoLibro = new Libro("Aprendiendo Relaciones 1:1 ", planetaLibros);
        
        //nuevoLibro.mostrarEditorial();
        
        //nuevoLibro.setEditorial(null);
        //nuevoLibro.mostrarEditorial();
        //System.out.println("La editorial " + planetaLibros.getNombre() + " sigue existiendo!");
        
        //Libro nuevoLibro = new Libro("Aprendiendo Relaciones 1:1 ");
        Autor nuevoAutor = new Autor ("Jorge Luis Borges");
        
        nuevoLibro.mostrarNombre();
        nuevoLibro.setNombre(nuevoAutor);
        nuevoLibro.mostrarNombre();
        
    }
    
}
