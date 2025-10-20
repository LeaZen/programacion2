
package Colecciones;

import java.util.ArrayList;
import java.util.List;


public class Profesor {
    
     private String id;
        private String nombre;
        private String especialidad;
        private List<Curso> cursos = new ArrayList<>();

        public Profesor(String id, String nombre, String especialidad) {
            this.id = id;
            this.nombre = nombre;
            this.especialidad = especialidad;
        }

        public String getId() { return id; }
        public String getNombre() { return nombre; }
        public String getEspecialidad() { return especialidad; }

        public void agregarCurso(Curso c) {
            if (!cursos.contains(c)) {
                cursos.add(c);
                if (c.getProfesor() != this) c.setProfesor(this);
            }
        }

        public void eliminarCurso(Curso c) {
            if (cursos.remove(c)) {
                if (c.getProfesor() == this) c.setProfesor(null);
            }
        }

        public void listarCursos() {
            System.out.println("Cursos de " + nombre + ":");
            for (Curso c : cursos) System.out.println("- " + c.getCodigo() + " " + c.getNombre());
            System.out.println();
        }

        public void mostrarInfo() {
            System.out.println(String.format("Profesor[id=%s, nombre=%s, especialidad=%s, cantidadCursos=%d]",
                    id, nombre, especialidad, cursos.size()));
        }

        public List<Curso> getCursos() { return cursos; }
    
    
}
