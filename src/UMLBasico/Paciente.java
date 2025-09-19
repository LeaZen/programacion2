
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

public class Paciente {
    // ATRIBUTOS
    private String nombre;
    private String obraSocial;
    
    // CONSTRUCTOR
    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() {
        return nombre;
    }
}
