
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

public class ejercicio13 {
    
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario("Martin");
        
        GeneradorQr generador = new GeneradorQr();
        
        //System.out.println("Usuario: " + usuario1.getNombre());
        generador.generar("CZS124BYZ", usuario1);
        
    }
    
}
