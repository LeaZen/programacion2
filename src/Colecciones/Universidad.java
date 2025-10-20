
package Colecciones;

import java.util.ArrayList;
import java.util.List;


public class Universidad {
    private String nombre;
        private List<Profesor> profesores = new ArrayList<>();
        private List<Curso> cursos = new ArrayList<>();

        public Universidad(String nombre) {
            this.nombre = nombre;
        }

        public void agregarProfesor(Profesor p) { profesores.add(p); }
        public void agregarCurso(Curso c) { cursos.add(c); }

        public Profesor buscarProfesorPorId(String id) {
            for (Profesor p : profesores) if (p.getId().equals(id)) return p;
            return null;
        }

        public Curso buscarCursoPorCodigo(String codigo) {
            for (Curso c : cursos) if (c.getCodigo().equals(codigo)) return c;
            return null;
        }

        public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
            Curso c = buscarCursoPorCodigo(codigoCurso);
            Profesor p = buscarProfesorPorId(idProfesor);
            if (c != null) {
                c.setProfesor(p);
            }
        }

        public void listarProfesores() {
            System.out.println("Profesores en " + nombre + ":");
            for (Profesor p : profesores) p.mostrarInfo();
            System.out.println();
        }

        public void listarCursos() {
            System.out.println("Cursos en " + nombre + ":");
            for (Curso c : cursos) c.mostrarInfo();
            System.out.println();
        }

        public void eliminarCurso(String codigo) {
            Curso c = buscarCursoPorCodigo(codigo);
            if (c != null) {
                if (c.getProfesor() != null) c.getProfesor().eliminarCurso(c);
                cursos.remove(c);
            }
        }

        public void eliminarProfesor(String id) {
            Profesor p = buscarProfesorPorId(id);
            if (p != null) {
                // dejar null los cursos que dictaba
                for (Curso c : new ArrayList<>(p.getCursos())) {
                    c.setProfesor(null);
                }
                profesores.remove(p);
            }
        }

        public void reporteCantidadCursosPorProfesor() {
            System.out.println("Reporte: cantidad de cursos por profesor:");
            for (Profesor p : profesores) {
                System.out.println("- " + p.getNombre() + ": " + p.getCursos().size());
            }
            System.out.println();
        }
}
