
package UMLBasico;

/**
9.	CitaMédica - Paciente - Profesional
a.	Asociación unidireccional: CitaMédica → Paciente,
b.	Asociación unidirecciona: CitaMédica → Profesional
Clases y atributos:
i.	CitaMédica: fecha, hora
ii.	Paciente: nombre, obraSocial
iii.	Profesional: nombre, especialidad
*/

public class Profesional {
    // ATRIBUTOS
    private String nombre;
    private String especialidad;
    
    // CONSTRUCTOR
    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }
    
}
