
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

public class ejercicio8 {
    public static void main(String[] args) {
             
        Usuario usuario1 = new Usuario("Lucia Fernandez");
        
        // Creación de Documento (se genera también la FirmaDigital obligatoria)
        Documento doc1 = new Documento(
                "Contrato de Servicios",
                "Contenido del contrato...",
                "ABC123HASH",
                "16/09/2025",
                usuario1
        );

        System.out.println("Documento creado: " + doc1.getFirma().getCodigoHash());
        System.out.println("Usuario que firmo: " + doc1.getFirma().getUsuario().getNombre());
    }
    }

