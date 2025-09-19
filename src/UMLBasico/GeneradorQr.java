
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

public class GeneradorQr {

    // No hay atributo de la clase Usuario, solo el metodo.
    
    public void generar(String valor, Usuario usuario){
    
        if (valor != null && usuario != null){
            CodigoQr codigo1 = new CodigoQr(valor, usuario);
        
            System.out.println("Se genero el Codigo QR con valor: " + codigo1.getValor() 
                               + " para el usuario: " + usuario.getNombre()); 
        } else {
            System.out.println("No se pudo generar el Código QR. Datos inválidos.");
        }
    }
}
