
package UMLBasico;

/**
1. Pasaporte - Foto - Titular
a.	Composición: Pasaporte → Foto
b.	Asociación bidireccional: Pasaporte ↔ Titular
Clases y atributos:
i.	Pasaporte: numero, fechaEmision
ii.	Foto: imagen, formato
iii.	Titular: nombre, dni
 */
public class Foto {
    
    private String imagen;
    private String formato;
    // CONSTRUCTOR
    public Foto(String imagen) {
        this.imagen = imagen;
    }
    // GETTER
    public String getImagen() {
        return imagen;
    }
    
    
    
}
