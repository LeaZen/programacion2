
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

public class Libro {
    // ATRIBUTOE
    private String titulo;
    private String isbn;
    private Autor nombre; // Asociación Unidirecional 1:1
    private Editorial editorial; // Agregacion 1:1
    
    // CONSTRUCTOR
    public Libro(String titulo, Editorial editorial) {
        this.titulo = titulo;
        this.editorial = editorial;
    }
    
   
   // Metodos 
    public void mostrarNombre(){
        if (nombre != null){
            System.out.println("El libro " + titulo + " Tiene de autor a " + nombre.getNombre());
        } else{
            System.out.println("El libro " + titulo + " No tiene de autor");
        }
    
    }
    public void mostrarEditorial(){
        if (editorial != null){
            System.out.println("El libro " + titulo + " Tiene de editorial a " + editorial.getNombre());
        } else{
            System.out.println("El libro " + titulo + " No tiene editorial");
        }
        
    }
    
    // Metodos Get & Set
    
     public void setNombre (Autor nombre){
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    
    
}
