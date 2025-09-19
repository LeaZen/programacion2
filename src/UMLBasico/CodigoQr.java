
package UMLBasico;

/**
13.	GeneradorQR - Usuario - CódigoQR
a.	Asociación unidireccional: CódigoQR → Usuario
b.	Dependencia de creación: GeneradorQR.generar(String, Usuario)
Clases y atributos:
i.	CodigoQR: valor.
ii.	Usuario: nombre, email.
iii.	GeneradorQR->método: void generar(String valor, Usuario usuario)
*/

public class CodigoQr {
    //ATRIBUTOS
    private String valor;
    private Usuario usuario; // Asociación unidireccional: CódigoQR → Usuario
    //CONSTRUCTOR
    public CodigoQr(String valor, Usuario usuario) {
        this.valor = valor;
    }
    
    public String getValor() {
        return valor;
    }
    
    public String getUsuario() {
        if (usuario == null) {
            return "Usuario no disponible.";
        } else {
            return usuario.getNombre();
        }
    }

} // Cierre clase.