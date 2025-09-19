
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

public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto) {
        if (proyecto != null) {
            Render render = new Render(formato, proyecto); 
            
            System.out.println("Exportando proyecto '" 
                               + proyecto.getNombre() 
                               + "' en formato " 
                               + render.getFormato());
        } else {
            System.out.println("No hay proyecto para exportar.");
        }
    }
}
