
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

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario; // Agregación con clase Usuario.

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario; // Agregación con clase Usuario
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }
    
    
}
