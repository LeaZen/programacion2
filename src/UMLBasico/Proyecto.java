
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

public class Proyecto {
    // ATRIBUTOS
    private String nombre;
    private int duracionMin;

    // CONSTRUCTOR
    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionMin() {
        return duracionMin;
    }
}
