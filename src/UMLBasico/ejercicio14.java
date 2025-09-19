
package UMLBasico;

/**
14.	EditorVideo - Proyecto - Render
a.	Asociación unidireccional: Render → Proyecto
b.	Dependencia de creación: EditorVideo.exportar(String, Proyecto)
c.	Clases y atributos:
i.	Render: formato.
ii.	Proyecto: nombre, duracionMin.
iii.	EditorVideo->método: void exportar(String formato, Proyecto proyecto)
*/

public class ejercicio14 {
    
    public static void main(String[] args) {
        
        Proyecto proyecto1 = new Proyecto("Video Dependencia de Creacion", 15);
        
        EditorVideo editor = new EditorVideo();
        
        System.out.println("Proyecto: " + proyecto1.getNombre());
        editor.exportar("MP4", proyecto1);
        
    }
            
            
}
