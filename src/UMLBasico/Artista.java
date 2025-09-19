
package UMLBasico;

/**
11.	Reproductor - Canción - Artista
a.	Asociación unidireccional: Canción → Artista
b.	Dependencia de uso: Reproductor.reproducir(Cancion)
Clases y atributos:
i.	Canción: titulo.
ii.	Artista: nombre, genero.
iii.	Reproductor->método: void reproducir(Cancion cancion)
*/

public class Artista {
    // ATRIBUTOS
    private String nombre;
    private String genero;

    // CONSTRUCTOR
    public Artista(String nombre) {
        this.nombre = nombre;
    }
    
    
   public String getNombre() {
      return nombre;
   }

 
   
    
    
}
