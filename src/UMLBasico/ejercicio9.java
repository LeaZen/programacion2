
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

public class ejercicio9 {
    public static void main(String[] args) {
        
         // Crear un Paciente
        Paciente paciente1 = new Paciente("Lucia Gomez", "OSDE");

        // Crear un Profesional
        Profesional doctor1 = new Profesional("Dr. Juan Perez", "Cardiología");

        // Crear una Cita Médica (solo fecha y hora)
        CitaMedica cita1 = new CitaMedica("18/09/2025", "10:30");

        // Antes de asignar paciente y profesional
        System.out.println("Paciente asignado: " + cita1.getPaciente());
        System.out.println("Profesional asignado: " + cita1.getProfesional());

        // Asignar paciente y profesional
        cita1.setPaciente(paciente1);
        cita1.setProfesional(doctor1);

        // Mostrar la información después de asignar
        System.out.println("Cita medica para el paciente: " + cita1.getPaciente().getNombre());
        System.out.println("Con el profesional: " + cita1.getProfesional().getNombre());
    }
        
}

