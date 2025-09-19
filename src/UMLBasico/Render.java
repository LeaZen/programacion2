
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

public class Render {
    
    // ATRIBUTOS
    private String formato;
    private Proyecto proyecto; // Asociación unidireccional: Render → Proyecto

    // CONSTRUCTOR
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
}
