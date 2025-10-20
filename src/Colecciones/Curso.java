
package Colecciones;


public class Curso {
    private String codigo;
        private String nombre;
        private Profesor profesor;

        public Curso(String codigo, String nombre) {
            this.codigo = codigo;
            this.nombre = nombre;
        }

        public String getCodigo() { return codigo; }
        public String getNombre() { return nombre; }
        public Profesor getProfesor() { return profesor; }

        public void setProfesor(Profesor p) {
            // remover de profesor anterior
            if (this.profesor != null && this.profesor != p) {
                Profesor prev = this.profesor;
                this.profesor = null;
                prev.eliminarCurso(this);
            }
            // asignar al nuevo profesor
            this.profesor = p;
            if (p != null && !p.getCursos().contains(this)) {
                p.getCursos().add(this);
            }
        }

        public void mostrarInfo() {
            System.out.println(String.format("Curso[codigo=%s, nombre=%s, profesor=%s]",
                    codigo, nombre, (profesor != null ? profesor.getNombre() : "Sin profesor")));
        }
}
