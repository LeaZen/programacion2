
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

public class CitaMedica {
    // ATRIBUTOS
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;
    // CONSTRUCTOR
    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    // FUNCION EN BASE A ASOCIACIÓN UNIDIRECCIONAL CON PACIENTE
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    // FIN FUNCIONES EN BASE A ASOCIACIÓN UNIDIRECCIONAL CON PACIENTE
    
    // FUNCION EN BASE A ASOCIACIÓN UNIDIRECCIONAL CON PROFESIONAL
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public Profesional getProfesional() {
        return profesional;
    }
    // FIN FUNCIONES EN BASE A ASOCIACIÓN UNIDIRECCIONAL CON PROFESIONAL
}
