
package UMLBasico;

/**
8.	Documento - FirmaDigital - Usuario
a.	Composición: Documento → FirmaDigital
b.	Agregación: FirmaDigital → Usuario
Clases y atributos:
i.	Documento: titulo, contenido
ii.	FirmaDigital: codigoHash, fecha
iii.	Usuario: nombre, email
 */

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composición con clase FirmaDigital.
    
    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuario); // Composición
    }

    public FirmaDigital getFirma() {
        return firma;
    }
}

    

