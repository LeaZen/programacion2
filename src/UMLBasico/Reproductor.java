
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

public class Reproductor {
    
    // No hay atributo de la clase Cancion, solo el metodo.
    
    public void reproducir(Cancion cancion){
    
        if (cancion != null){
            System.out.println("La cancion esta sonando!!"); 
        } else {
            System.out.println("No hay cancion para reproducir");
        }
}
    
    
}
