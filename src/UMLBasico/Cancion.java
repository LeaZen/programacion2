
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

public class Cancion {
    // ATRIBUTOS
    private String titulo;
    private Artista artista;
    // CONSTRUCTOR
    public Cancion(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        if (artista == null){
            return "El nombre del artista no esta disponible.";
        } else {
            return artista.getNombre();
        } 
    }
    
    
} // Cierre clase.
