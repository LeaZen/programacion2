/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

public class ejercicio11 {
    
    public static void main(String[] args) {
        
        Cancion tema1 = new Cancion("Cancion Dependiente de Uso");
        
        Reproductor repro = new Reproductor();
        
        System.out.println(tema1.getTitulo());
        repro.reproducir(tema1);
        
        System.out.println(tema1.getArtista());
    }
    
}
