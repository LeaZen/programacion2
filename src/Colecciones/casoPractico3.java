
package Colecciones;


public class casoPractico3 {
     public static void main(String[] args) {
        
       Universidad uni = new Universidad("Universidad Nacional");
        Profesor p1 = new Profesor("P001", "Ana Lopez", "Matemáticas");
        Profesor p2 = new Profesor("P002", "Diego Martin", "Programación");
        Profesor p3 = new Profesor("P003", "Maria Ruiz", "Física");

        Curso c1 = new Curso("C001", "Algebra I");
        Curso c2 = new Curso("C002", "Programacion I");
        Curso c3 = new Curso("C003", "Fisica I");
        Curso c4 = new Curso("C004", "Estructuras de Datos");
        Curso c5 = new Curso("C005", "Bases de Datos");

        // 1. Crear al menos 3 profesores y 5 cursos. (ya creados arriba)
        uni.agregarProfesor(p1); uni.agregarProfesor(p2); uni.agregarProfesor(p3);
        uni.agregarCurso(c1); uni.agregarCurso(c2); uni.agregarCurso(c3); uni.agregarCurso(c4); uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        uni.asignarProfesorACurso("C001", "P001");
        uni.asignarProfesorACurso("C002", "P002");
        uni.asignarProfesorACurso("C003", "P003");
        uni.asignarProfesorACurso("C004", "P002");
        uni.asignarProfesorACurso("C005", "P002");

        // 4. Listar cursos con su profesor y profesores con sus cursos.
        uni.listarCursos(); uni.listarProfesores();

        // 5. Cambiar el profesor de un curso y verificar sincronización.
        System.out.println("Cambiar profesor de C001 a P003"); uni.asignarProfesorACurso("C001", "P003"); uni.listarCursos(); uni.listarProfesores();

        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("Eliminar curso C003"); uni.eliminarCurso("C003"); uni.listarCursos(); uni.listarProfesores();

        // 7. Remover un profesor y dejar profesor = null en sus cursos.
        System.out.println("Eliminar profesor P002"); uni.eliminarProfesor("P002"); uni.listarProfesores(); uni.listarCursos();

        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        uni.reporteCantidadCursosPorProfesor();

        System.out.println("--- FIN DEMOSTRACIÓN ---");
    }
}

